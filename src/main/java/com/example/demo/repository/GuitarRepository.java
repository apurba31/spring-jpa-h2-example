package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.model.GuitarModel;

@Repository
public interface GuitarRepository extends JpaRepository<GuitarModel, Long>{

}
