package net.sadiq.patient.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Getter @Setter
public class Patient {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
   @Temporal(TemporalType.DATE)
    private Date dateNaissance;
   private boolean maladie;
   private int score;

}
