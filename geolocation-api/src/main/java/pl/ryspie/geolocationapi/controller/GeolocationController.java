package pl.ryspie.geolocationapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.ryspie.geolocationapi.model.GeolocationDto;
import pl.ryspie.geolocationapi.service.GeolocationService;

@RestController
@RequiredArgsConstructor
public class GeolocationController {
    GeolocationService geolocationService;

    @Autowired
    public GeolocationController(GeolocationService geolocationService) {
        this.geolocationService = geolocationService;
    }
    @GetMapping("/location")
    public GeolocationDto getGeolocation(@RequestParam String address) {
        return geolocationService.getGeolocation(address);
    }

}
