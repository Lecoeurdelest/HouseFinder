package com.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "user")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    // account info
    private String username;
    private String password;
    private String role;
    private String status;

    // personal info
    private String email;
    private String phone;
    private String gender;

    // if status = tenant -> no house
    @OneToMany(mappedBy = "owner")
    private Set<House> houses;

    public User(String username, String password, String role, String email, String phone, String gender) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.email = email;
        this.phone = phone;
        this.gender = gender;
        this.status = "active";
        houses = new HashSet<>();
    }
}
