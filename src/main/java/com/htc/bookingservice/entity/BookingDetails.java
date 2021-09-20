package com.htc.bookingservice.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "bookingservice")
public class BookingDetails {
	
	@Id
	private long bookingId;
	@Column
	private long centreid;
	@Column
	private String pincode;
	public BookingDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookingDetails(long bookingId, long  centreid, String pincode) {
		super();
		this.bookingId = bookingId;
		this.centreid = centreid;
		this.pincode = pincode;
	}
	public long getBookingId() {
		return bookingId;
	}
	public void setBookingId(long bookingId) {
		this.bookingId = bookingId;
	}
	public long getCentreid() {
		return centreid;
	}
	public void setCentreid(long centreid) {
		this.centreid = centreid;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pinCode) {
		this.pincode = pinCode;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (bookingId ^ (bookingId >>> 32));
		result = prime * result + (int) (centreid ^ (centreid >>> 32));
		result = prime * result + ((pincode == null) ? 0 : pincode.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookingDetails other = (BookingDetails) obj;
		if (bookingId != other.bookingId)
			return false;
		if (centreid != other.centreid)
			return false;
		if (pincode == null) {
			if (other.pincode != null)
				return false;
		} else if (!pincode.equals(other.pincode))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "BookingDetail [bookingId=" + bookingId + ", centreid=" + centreid + ", pincode=" + pincode + "]";
	}
	

}
