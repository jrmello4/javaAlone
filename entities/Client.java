package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private String name;
	private String email;
	private Date birthdayDate;
	
	public Client() {
	}

	public Client(String name, String email, Date birthdayDate) {
		this.name = name;
		this.email = email;
		this.birthdayDate = birthdayDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthdayDate() {
		return birthdayDate;
	}

	public void setBirthdayDate(Date birthdayDate) {
		this.birthdayDate = birthdayDate;
	}

	@Override
	public String toString() {
		return name + " " + sdf.format(birthdayDate)+ " - " + email;
	}
	
	
	
}
