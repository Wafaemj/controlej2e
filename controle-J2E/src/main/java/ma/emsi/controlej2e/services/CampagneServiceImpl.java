package ma.emsi.controlej2e.services;

import ma.emsi.controlej2e.entités.Campagne;
import ma.emsi.controlej2e.repositories.CampagneRepository;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;

@Service
public class CampagneServiceImpl implements CampagneService {
    private final CampagneRepository campagneRepository;

    public CampagneServiceImpl(CampagneRepository campagneRepository) {
        this.campagneRepository = campagneRepository;
    }

    @Override
    public List<Campagne> getCampagnesActives() {
        LocalDate now = LocalDate.now();
        return campagneRepository.findByDateDebutLessThanEqualAndDateFinGreaterThanEqual(now, now);
    }
}