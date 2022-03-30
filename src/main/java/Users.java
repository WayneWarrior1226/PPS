/**
 * 
 * users.java
 * This class represents a user entity
 * @author 
 *
 */

public class Users{
	protected String email;
	protected String password;
	protected String fname;
	protected String lname;
	protected String birthday;
	protected String streetnum;
	protected String street;
	protected String city;
	protected String state;
	protected String zip;
	protected String dollaramount;
	

	
	
	
	public Users(String password, String fname, String lname, String birthday, String streetnum, String street, String city,
			String state, String zip, String dollaramount, String ppsamount) {
		super();
		this.password = password;
		this.fname = fname;
		this.lname = lname;
		this.birthday = birthday;
		this.streetnum = streetnum;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.dollaramount = dollaramount;
		this.ppsamount = ppsamount;
	}



	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getStreetnum() {
		return streetnum;
	}
	public void setStreetnum(String streetnum) {
		this.streetnum = streetnum;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getDollaramount() {
		return dollaramount;
	}
	public void setDollaramount(String dollaramount) {
		this.dollaramount = dollaramount;
	}
	public String getPpsamount() {
		return ppsamount;
	}
	public void setPpsamount(String ppsamount) {
		this.ppsamount = ppsamount;
	}
	protected String ppsamount;


}



