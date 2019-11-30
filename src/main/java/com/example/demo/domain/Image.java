package com.example.demo.domain;

import com.sun.javafx.beans.IDProperty;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "image")
@Data
public class Image {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    @Lob // аннльация чтоби указать что ето будет картинка
    private Byte[] image;

    public Image() {
    }

    public Image(String description, Byte[] image) {
        this.description = description;
        this.image = image;
    }
}
