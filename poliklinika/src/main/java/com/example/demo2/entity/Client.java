package com.example.demo2.entity;


import javax.persistence.*;

@Entity
@Table (name ="clients")

public class Client {
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
@Column (name = "first_name", nullable = false)
    private String firstname;
@Column (name = "last_name")
    private String lastname;
@Column (name = "email")
    private String email;

    public Client(String firstname){
        super();
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;

    }

    public Client() {

    }

    public Long getId() {
        return id;
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

    public void setId(Long id) {
    }
}
