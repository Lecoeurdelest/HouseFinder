package com.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "utility")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Utility {
    @Id
    @Column(name = "utility_id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Column(name = "utility_name")
    private String name;
    //@Column(name = "icon_path")
    @Column(name = "icon_path")
    private String iconPath;

    public Utility(String name, String iconPath) {
        this.name = name;
        this.iconPath = iconPath;
    }
}
