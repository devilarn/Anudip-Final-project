package ElectricVehicleBookingSystem;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        // Create a new customer
        Customer customer = new Customer();
        ((Customer) customer).setName("Vishal Dhimane");
        customer.setAge(30);
        customer.setEmail("dhimanevishal@gmail.com");

        // Save the customer to the database
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try 
        {
            transaction = session.beginTransaction();
            session.save(customer);
            transaction.commit();
        } 
        catch (Exception e) 
        {
            if (transaction != null) 
            {
                transaction.rollback();
            }
            e.printStackTrace();
        } 
        finally 
        {
            session.close();
        }

        // Shut down Hibernate
        HibernateUtil.shutdown();
    }
}
