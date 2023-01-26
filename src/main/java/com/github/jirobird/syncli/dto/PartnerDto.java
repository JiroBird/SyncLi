package com.github.jirobird.syncli.dto;

import com.github.jirobird.syncli.entity.Partner;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PartnerDto {

    private PartnerDto() {

    }

    private String name = "";
    private String login = "";
    private String token = null;
    private long expTime = -1;

    public static PartnerDto fromDB(Partner partner) {
        PartnerDto partnerDTO = new PartnerDto();
        partnerDTO.setLogin(partner.getLogin());
        partnerDTO.setName(partner.getName());
        partnerDTO.setToken(partner.getToken());
        if (partner.getTokenExpDate() != null) {
            partnerDTO.setExpTime(partner.getTokenExpDate().getTime());
        } else {
            partnerDTO.setExpTime(-1);
        }
        return partnerDTO;
    }
}
