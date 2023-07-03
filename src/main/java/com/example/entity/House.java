package com.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "house")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class House {
    @Id
    @Column(name = "house_id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name = "house_name")
    private String name;
    @Column(name = "house_type")
    private String type;
    @Column(name = "house_status")
    private String status;


    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "house_utility",joinColumns = @JoinColumn(name = "house_id"), inverseJoinColumns = @JoinColumn(name = "utility_id"))
    Set<Utility> utilities;

}
