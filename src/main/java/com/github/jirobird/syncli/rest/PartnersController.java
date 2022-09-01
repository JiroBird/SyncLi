package com.github.jirobird.syncli.rest;

import com.github.jirobird.syncli.repository.PartnerRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PartnersController {

    private final PartnerRepository partnerRepository;

    PartnersController(PartnerRepository repository) {
        partnerRepository = repository;
    }

    @GetMapping("/hi_partner")
    long getAuth(){
        return partnerRepository.count();
    }
}
