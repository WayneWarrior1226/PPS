/**
 * 
 * users.java
 * This class represents a user entity
 * @author 
 *
 */

public class Users{
	protected String userid;
	protected String password;
	protected String fname;
	protected String lname;
	protected int birthday;
	protected int streetnum;
	protected String street;
	protected String city;
	protected String state;
	protected int zip;


public Users() {
}

public Users(String userid) {
	this.userid = userid;
}
public Users(String userid, String password, String fname, String lname, int birthday, 
		int streetnum, String street, String city, String state,int zip) {
	this(password,fname,lname,birthday,streetnum,street,city,state,zip);
	this.userid = userid;
}

public Users(String password, String fname, String lname, int birthday, 
		int streetnum, String street, String city, String state,int zip) {
	this.password = password;
	this.fname=fname;
	this.lname=lname;
	this.birthday = birthday;
	this.streetnum = streetnum;
	this.street = street;
	this.city=city;
	this.state = state;
	this.zip=zip;
}
/*get user id
 *
*/
public String getId() {
	return userid;
}

public void setUserId(String userid) {
	this.userid=userid;
}

public String getPassword(){
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getfname() {
	return fname;
}

public void setfname(String fname) {
	this.fname=fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname=lname;
}

public int getBirthday() {
	return birthday;
}

public void setBirthday(int birthday) {
	
	this.birthday = birthday;
}

public int getStreetnum() {
	return streetnum;
}

public void setStreetnum(int streetnum) {
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
	this.city=city;
}

public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
}

public int getZip() {
	return zip;
	
}

public void setZip(int zip) {
	this.zip = zip;
	
}
}




