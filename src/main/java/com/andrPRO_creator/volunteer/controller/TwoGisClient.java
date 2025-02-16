package com.andrPRO_creator.volunteer.controller;


import com.andrPRO_creator.volunteer.model.MapResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "2gisClient", url = "https://catalog.api.2gis.com/3.0")
public interface TwoGisClient {

    @GetMapping("/items")
    MapResponse searchPlaces(
            @RequestParam("q") String query,
            @RequestParam("point") String point,
            @RequestParam("radius") int radius,
            @RequestParam("key") String apiKey,
            @RequestParam("fields") String fields
    );
}
