package ma.emsi.controlej2e.entités;

import jakarta.persistence.*;
        import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Campagne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private BigDecimal objectifMontant;
    private LocalDate dateDebut;
    private LocalDate dateFin;

    // Constructeurs + Getters/Setters
}