package com.example.demo.domain;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "language")
@JacksonXmlRootElement
public class LanguageMySQL {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String creator;
    private String feature;

    public LanguageMySQL() {
    }

    public LanguageMySQL(String name, String creator, String feature) {
        this.name = name;
        this.creator = creator;
        this.feature = feature;
    }
}
