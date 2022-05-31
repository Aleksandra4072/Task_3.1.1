package com.example.task311.model;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column (name = "first_name")
    @NotEmpty(message = "Name may not be empty")
    private String firstName;

    @Column (name = "last_name")
    @NotEmpty(message = "Last name may not be empty")
    private String lastName;

    @Column (name = "email")
    private String email;

    public User() {
    }

    public User(String firstName, String secondName, String email) {
        this.firstName = firstName;
        this.lastName = secondName;
        this.email = email;
    }

    public User(long id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
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

    public void setLastName(String lastNameName) {
        this.lastName = lastNameName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
