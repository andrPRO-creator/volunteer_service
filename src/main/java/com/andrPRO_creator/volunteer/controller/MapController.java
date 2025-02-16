package com.andrPRO_creator.volunteer.controller;

import com.andrPRO_creator.volunteer.model.Place;
import com.andrPRO_creator.volunteer.service.MapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/map")
public class MapController {

    @Autowired
    private MapService mapService;

    @GetMapping("/search")
    public List<Place> search(
            @RequestParam String query,
            @RequestParam double lon,
            @RequestParam double lat,
            @RequestParam int radius
    ) {
        return mapService.searchPlaces(query, lon, lat, radius);
    }
}
