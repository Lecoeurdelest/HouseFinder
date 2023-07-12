package com.housefinder.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "renting")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Renting {
    @Id
    @Column(name = "renting_id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "tenant_id",nullable = false)
    private User tenant;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "house_id", nullable = false)
    private House house;

    @Column(name = "moved_in_date")
    private Date movedInDate;
    @Column(name = "renting_months")
    private int bookingMonthNumber;
    @Column(name = "renting_status")
    private String status;

    public Renting(User tenant, House house, Date movedInDate, int bookingMonthNumber, String status) {
        this.tenant = tenant;
        this.house = house;
        this.movedInDate = movedInDate;
        this.bookingMonthNumber = bookingMonthNumber;
        this.status = status;
    }
}
