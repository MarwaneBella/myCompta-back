package com.codingart.mycompta.repository;

import com.codingart.mycompta.model.Phone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneRepository extends JpaRepository<Phone, Long> {
}