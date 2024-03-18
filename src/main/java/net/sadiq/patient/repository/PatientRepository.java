package net.sadiq.patient.repository;

import net.sadiq.patient.entity.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;

public interface PatientRepository extends JpaRepository<Patient,Long> {
  Page<Patient> findByNomContains(String keyword, Pageable pageable);
}
