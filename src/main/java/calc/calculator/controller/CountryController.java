package calc.calculator.controller;

import calc.calculator.entity.Country;
import calc.calculator.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
@RequestMapping("/country")
public class CountryController {
    private final static Logger LOG = Logger.getLogger(CountryController.class.getName());
    private final CountryRepository countryRepository;

    @Autowired
    public CountryController(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @GetMapping
    public ResponseEntity<Country> country() {
        Country country = countryRepository.save(new Country());
        LOG.info("saved new data: " + country.getName());
        return ResponseEntity.ok(country);
    }
}
