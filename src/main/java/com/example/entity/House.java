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

    // house info
    @Column(name = "house_name")
    private String name;
    @Column(name = "house_type")
    private String type;
    private double area;
    private String address;
    @Column(name = "house_status")
    private String status;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "owner_id",nullable = false)
    private User owner;

    // price info
    @Column(name = "base_price")
    private double basePrice;
    private double deposit;
    @Column(name = "electric_price")
    private double electricPrice;
    @Column(name = "water_price")
    private double waterPrice;
    @Column(name = "wifi_price")
    private double wifiPrice;

    // tenant info
    @Column(name = "tenant_number")
    private int tenantNumber;
    @Column(name = "tenant_gender")
    private String tenantGender;

    // utility
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "house_utility",joinColumns = @JoinColumn(name = "house_id"), inverseJoinColumns = @JoinColumn(name = "utility_id"))
    Set<Utility> utilities;
    public void add(Utility utility){
        utilities.add(utility);
    }
    public void remove(Utility utility){
        utilities.remove(utility);
    }
    public boolean has(Utility utility){
        return utilities.contains(utility);
    }
    public boolean has(Set<Utility> utilities){
        return this.utilities.containsAll(utilities);
    }
    // image
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "house_id")
    private Set<Image> images;
    public void add(Image image){
        images.add(image);
    }
    public void remove(Image image){
        images.remove(image);
    }
}
