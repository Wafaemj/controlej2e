package ma.emsi.controlej2e.repositories;

import ma.emsi.controlej2e.entités.Donation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonationRepository extends JpaRepository<Donation, Long> {
}