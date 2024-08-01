package ElectricVehicleBookingSystem;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "age", nullable = false)
    private int age;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

	public void setName(String string) 
	{
		// TODO Auto-generated method stub
		
	}

	public void setAge(int i) 
	{
		// TODO Auto-generated method stub
		
	}

	public void setEmail(String string) 
	{
		// TODO Auto-generated method stub
		
	}

    // Getters and setters
}

