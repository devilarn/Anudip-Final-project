package ElectricVehicleBookingSystem;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import java.util.Date;

@Entity
@Table(name = "bookings")
public class Booking 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @Column(name = "booking_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date bookingDate;

    @Column(name = "status", nullable = false)
    private String status;

    @Column(name = "rental_type", nullable = false)
    private String rentalType;

    @Column(name = "payment_method")
    private String paymentMethod;

    @Column(name = "is_deleted")
    private boolean isDeleted;

	public void setBookingStatus(String string) {
		// TODO Auto-generated method stub
		
	}

    // Getters and setters
}

