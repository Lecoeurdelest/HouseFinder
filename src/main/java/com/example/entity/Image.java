package com.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Entity
@Table(name = "image")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Image {
    @Id
    @Column(name = "image_id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Column(name = "image_path")
    private String imagePath;
    @Column(name = "is_thumbnail")
    private boolean isThumbnail;

    @Column(name = "image_status")
    private String status;
    public Image(String imagePath, boolean isThumbnail) {
        this.imagePath = imagePath;
        this.isThumbnail = isThumbnail;
        this.status = "active";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Image image = (Image) o;
        return isThumbnail == image.isThumbnail && id.equals(image.id) && imagePath.equals(image.imagePath);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, imagePath, isThumbnail);
    }
}
