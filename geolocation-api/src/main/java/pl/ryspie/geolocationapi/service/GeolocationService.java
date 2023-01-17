package pl.ryspie.geolocationapi.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.ryspie.geolocationapi.mapper.GeocodingApiDtoToGeolocationDtoMapper;
import pl.ryspie.geolocationapi.model.GeolocationDto;
import pl.ryspie.geolocationapi.webCLient.geolocation.GeocodingApiClient;
import pl.ryspie.geolocationapi.webCLient.geolocation.dto.GeocodingApiDto;

@Service
@Slf4j
public class GeolocationService {

    private final GeocodingApiClient geocodingApiClient;

    @Autowired
    public GeolocationService(GeocodingApiClient geocodingApiClient) {
        this.geocodingApiClient = geocodingApiClient;
    }

    public GeolocationDto getGeolocation(String address) {
        GeocodingApiDto response = geocodingApiClient.getGeolocationInfoForAddress(address);
        return GeocodingApiDtoToGeolocationDtoMapper.map(response);
    }


}
