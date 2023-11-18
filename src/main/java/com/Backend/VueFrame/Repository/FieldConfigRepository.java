package com.Backend.VueFrame.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Backend.VueFrame.Model.FieldConfigData;

public interface FieldConfigRepository extends JpaRepository<FieldConfigData, String> {

}