package Anudip.project.Online_food_delivery.entities;
import javax.persistence.*;

@Entity
public class User {
	@Id
	@Column(name="Userid")
	private String userid;
	@Column(name="Username")
	private String username;
	@Column(name="Address")
	private String address;
	@Column(name="ContactNumber")
	private int Contact;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String userid, String username, String address, int contact) {
		super();
		this.userid = userid;
		this.username = username;
		this.address = address;
		this.Contact = contact;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
	    this.username = username;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getContact() {
		return Contact;
	}
	public void setContact(int contact) {
		Contact = contact;
	}
	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", address=" + address + ", Contact=" + Contact
				+ ", getUserid()=" + getUserid() + ", getUsername()=" + getUsername() + ", getAddress()=" + getAddress()
				+ ", getContact()=" + getContact() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	

}
