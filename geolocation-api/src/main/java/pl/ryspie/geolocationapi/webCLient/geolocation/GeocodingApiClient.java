package pl.ryspie.geolocationapi.webCLient.geolocation;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import pl.ryspie.geolocationapi.mapper.GeocodingApiDtoToGeolocationDtoMapper;
import pl.ryspie.geolocationapi.model.GeolocationDto;
import pl.ryspie.geolocationapi.webCLient.geolocation.dto.GeocodingApiDto;

import static java.util.stream.Collectors.toMap;

@Component
public class GeocodingApiClient {
    public static final RestTemplate restTemplate = new RestTemplate();
    private static final String GEOLOCATION_API_BASE_URL = "https://maps.googleapis.com/maps/api/geocode/";
    private static final String DATA_FORMAT = "json";
    private static final String API_KEY = "AIzaSyDV6J_lwZ8KtNQg_1DFdJLKQRPjrlxCm4E";

    public GeocodingApiDto getGeolocationInfoForAddress(String address) {
        return restTemplate.getForObject(GEOLOCATION_API_BASE_URL + DATA_FORMAT + "?address={address}&key={apiKey}",
                GeocodingApiDto.class, address, API_KEY);
    }


}
