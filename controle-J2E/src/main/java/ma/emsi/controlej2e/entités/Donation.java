package ma.emsi.controlej2e.entités;
import jakarta.persistence.*;
        import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Donation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Campagne campagne;

    private String nomDonateur;
    private BigDecimal montant;
    private LocalDate date;

    // Constructeurs + Getters/Setters
}