package data.base.entity;

import javax.persistence.*;

@Entity
@Table(name="car_seller")
public class CarSeller extends BaseEntity {
	
	
	
	
	@Column(name="first_name")
	private String firstName; 
	
	@Column(name= "second_name")
	private String secondName;
	
	@Column(name="age")
	private int age;
	
	@Column(name= "phone_number")
	private int phoneNumber;
	
	
	@OneToOne(mappedBy="carSeller",cascade=CascadeType.ALL)
	private Car cari;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "CarSeller [firstName=" + firstName + ", secondName=" + secondName + ", age=" + age + ", phoneNumber="
				+ phoneNumber + "]";
	}

	public CarSeller() {
	
	}

	public CarSeller(int age,String firstName,int phoneNumber, String secondName) {
		super();
		this.firstName = firstName;
		this.secondName = secondName;
		this.age = age;
		this.phoneNumber = phoneNumber;
	
	}
	
	
	
}
