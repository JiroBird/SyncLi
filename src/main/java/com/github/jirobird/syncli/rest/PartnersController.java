package com.github.jirobird.syncli.rest;

import com.github.jirobird.syncli.dto.PartnerDto;
import com.github.jirobird.syncli.entity.Partner;
import com.github.jirobird.syncli.repository.PartnerRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PartnersController {

    private final PartnerRepository partnerRepository;

    PartnersController(PartnerRepository repository) {
        partnerRepository = repository;
    }

    @GetMapping("/v1/partners_count")
    long partnersCount(){
        return partnerRepository.count();
    }

    @GetMapping("/v1/has_partner_name/{userName}")
    boolean hasPartnerWithName(@PathVariable String userName) {
        Partner partner = partnerRepository.findByLoginIgnoreCase(userName);
        return partner != null;
    }

    @GetMapping("/v1/find_partner_by/{name}")
    PartnerDto findPartnerByName(@PathVariable String name) {
        Partner partner = partnerRepository.findByLoginIgnoreCase(name);
        if (partner != null) {
            PartnerDto partnerDTO = PartnerDto.fromDB(partner);
            partnerDTO.setToken("");
            partnerDTO.setExpTime(-1);
            return partnerDTO;
        }

        return null;
    }
}
