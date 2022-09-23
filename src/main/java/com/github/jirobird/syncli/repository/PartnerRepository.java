package com.github.jirobird.syncli.repository;

import com.github.jirobird.syncli.entity.Partner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartnerRepository extends JpaRepository<Partner, String> {
    Partner findByLoginIgnoreCase(String name);
}