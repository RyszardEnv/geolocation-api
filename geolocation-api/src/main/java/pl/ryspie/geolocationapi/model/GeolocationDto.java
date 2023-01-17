package pl.ryspie.geolocationapi.model;

import lombok.Builder;
import lombok.Getter;


@Getter
@Builder
public class GeolocationDto {

    private Double altitude;
    private Double latitude;
    private String street;
    private Long streetNumber;
    private String postcode;
    private String city;

}
