package net.sadiq.patient;

import net.sadiq.patient.entity.Patient;
import net.sadiq.patient.repository.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class PatientApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatientApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(PatientRepository patientRepository){
        return args -> {
          for (int i = 0; i < 10; i++) {
              patientRepository.save(new Patient(null,"amine",new Date(),false,12));
              patientRepository.save(new Patient(null,"reda",new Date(),false,15));
              patientRepository.save(new Patient(null,"abdelali",new Date(),false,10));
              patientRepository.save(new Patient(null,"oussama",new Date(),false,10));
          }

          patientRepository.findAll().forEach(patient -> {
              System.out.println(patient.getNom());
          });


        };
    }

}
