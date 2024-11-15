package com.arengrd.sensorsapi.repositories;


import com.arengrd.sensorsapi.models.RootSensor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * Urban Observatory Repository Implemented
 */
@Data
@Slf4j
@Component
@RequiredArgsConstructor
public class UrbanObservatoryRepositoryImpl implements UrbanObservatoryRepository {

    /**
     * @see RestTemplate
     */
    private final RestTemplate restTemplate;


//    @Value("${api.sensors.url}")
    private String urlUrban = "https://newcastle.urbanobservatory.ac.uk/api/v1.1/sensors/PER_AIRMON_MESH1761150/json/";


    @Override
    public List<RootSensor> getRootSensors() throws Exception {

        URI uri = URI.create(urlUrban);
        ResponseEntity<RootSensor[]> entity = restTemplate.getForEntity(uri, RootSensor[].class);
        if (!entity.getStatusCode().is2xxSuccessful()) {
            throw new Exception("ERROR");
        }
        return new ArrayList<>(Arrays.asList(Objects.requireNonNull(entity.getBody())));
    }
}
