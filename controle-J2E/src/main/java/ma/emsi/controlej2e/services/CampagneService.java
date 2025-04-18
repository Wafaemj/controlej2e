package ma.emsi.controlej2e.services;

import ma.emsi.controlej2e.entités.Campagne;

import java.util.List;

public interface CampagneService {
    List<Campagne> getCampagnesActives();
}