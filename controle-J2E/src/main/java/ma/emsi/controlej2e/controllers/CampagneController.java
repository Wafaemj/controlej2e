package ma.emsi.controlej2e.controllers;

import ma.emsi.controlej2e.entités.Campagne;
import ma.emsi.controlej2e.services.CampagneService;
import org.springframework.web.bind.annotation.*;
        import java.util.List;

@RestController
@RequestMapping("/api/campagnes")
public class CampagneController {
    private final CampagneService campagneService;

    public CampagneController(CampagneService campagneService) {
        this.campagneService = campagneService;
    }

    @GetMapping("/actives")
    public List<Campagne> getCampagnesActives() {
        return campagneService.getCampagnesActives();
    }
}