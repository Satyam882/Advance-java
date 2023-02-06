package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="new_stud")
@ToString(exclude = "password")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Student extends BaseEntity {
	@Column(length = 20)
	private String firstname;
	@Column(length = 20)
	private String lastname;
	@Column(length = 20 ,unique = true)
	private String email;
	@Column(length = 20,nullable = false)
	private String password;
	private String location;
	private LocalDate joindate;
	public Student(String firstname,String lastname) {
		super();
		this.firstname=firstname;
		this.lastname=lastname;
	}
	public Student() {
		super();
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
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
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public LocalDate getJoindate() {
		return joindate;
	}
	public void setJoindate(LocalDate joindate) {
		this.joindate = joindate;
	}
	

}
