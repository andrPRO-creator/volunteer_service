package com.andrPRO_creator.volunteer.service;

import com.andrPRO_creator.volunteer.controller.TwoGisClient;
import com.andrPRO_creator.volunteer.model.MapResponse;
import com.andrPRO_creator.volunteer.model.Place;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MapService {

    private static final String API_KEY = "-";
    private final TwoGisClient twoGisClient;

    public MapService(TwoGisClient twoGisClient) {
        this.twoGisClient = twoGisClient;
    }

    public List<Place> searchPlaces(String query, double lon, double lat, int radius) {

        String point = lon + "," + lat;
        String fields = "items.point,items.name,items.contact_groups.contacts,items.schedule,items.description";

        MapResponse response = twoGisClient.searchPlaces(query, point, radius, API_KEY, fields);

        return response.getResult().getItems();
    }
}
