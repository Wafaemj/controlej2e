package ma.emsi.controlej2e.repositories;

import ma.emsi.controlej2e.entités.Campagne;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;
import java.util.List;

public interface CampagneRepository extends JpaRepository<Campagne, Long> {
    List<Campagne> findByDateDebutLessThanEqualAndDateFinGreaterThanEqual(LocalDate now1, LocalDate now2);
}