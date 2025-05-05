package com.example.demo.model;
import jakarta.persistence.*;

@Entity
@Table(name = "userdetails")
public class UserDetails {

	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String name;
	    private String mailid;
	    private String password;

	    // Add other fields based on the table columns

	 // Getters and Setters
	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getmailid() {
	        return mailid;
	    }

	    public void setmailid(String mailid) {
	        this.mailid = mailid;
	    }
	    public String getpassword() {
	        return password;
	    }

	    public void setpassword(String password) {
	        this.password = password;
	    }
}
