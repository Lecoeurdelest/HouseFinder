package com.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Utility utility = (Utility) o;
        return id.equals(utility.id) && name.equals(utility.name) && iconPath.equals(utility.iconPath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, iconPath);
    }
}
