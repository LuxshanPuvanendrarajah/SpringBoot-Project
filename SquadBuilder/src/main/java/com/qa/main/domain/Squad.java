package com.qa.main.domain;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Squad {
	
	@Id
	@GeneratedValue( strategy= GenerationType.IDENTITY)
	private long id;
	@Column(unique=false,nullable=false)
	private String link;
	@Column(unique=false,nullable = false)
	private String position;
	@Column(unique = false,nullable = false,length = 50) 
	private String firstName;
	@Column(unique = false,nullable = false,length = 50)
	private String lastName;
	@Column(unique = false,nullable = false)
	private int age;




    public Squad() {}
    
    //create
	public Squad( String firstName, String lastName, String position ,String link, int age) {
		super();
		this.link = link;
		this.position = position;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		
	}
	//read
	public Squad(long id, String firstName, String lastName, String position,String link,int age) {
		super();
		this.id = id;
		this.link = link;
		this.position = position;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		
	}






	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(age, position, firstName, id, lastName,link);}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Squad other = (Squad) obj;
		return age == other.age && Objects.equals(position, other.position) && Objects.equals(firstName, other.firstName)&& Objects.equals(link, other.link)
				&& id == other.id && Objects.equals(lastName, other.lastName);}
	}
	
	