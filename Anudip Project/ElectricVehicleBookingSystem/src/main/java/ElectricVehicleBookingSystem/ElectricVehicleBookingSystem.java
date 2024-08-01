package ElectricVehicleBookingSystem;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ElectricVehicleBookingSystem 
{
    private SessionFactory sessionFactory;

    public ElectricVehicleBookingSystem() 
    {
        sessionFactory = new Configuration().configure().buildSessionFactory();
    }

    public void registerUser(User user) 
    {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
    }

    public void bookVehicle(Booking booking) 
    {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.save(booking);
        session.getTransaction().commit();
    }

    public void cancelBooking(int bookingId) 
    {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        Booking booking = session.get(Booking.class, bookingId);
        booking.setBookingStatus("cancelled");
        session.getTransaction().commit();
    }

    public void verifyBooking(int bookingId) 
    {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        Booking booking = session.get(Booking.class, bookingId);
        // verify booking details
        session.getTransaction().commit();
    }
}