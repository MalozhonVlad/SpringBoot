package com.example.demo.repo;

import com.example.demo.domain.LanguageMySQL;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LanguageMySQLRepo extends CrudRepository<LanguageMySQL, Long> {

    @Query(value = "SELECT *  FROM language where language.feature='lisp'", nativeQuery = true)
    List<LanguageMySQL> moiObject();
}
