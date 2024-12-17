package com.arengrd.sensorsapi.services;


import com.arengrd.sensorsapi.models.RootSensor;
import com.arengrd.sensorsapi.repositories.UrbanObservatoryRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Slf4j
@RequiredArgsConstructor
@Service
public class SensorsServiceImpl implements SensorsService{

    private final UrbanObservatoryRepository repository;


    @Override
    public List<RootSensor> getData() throws Exception {

        List<RootSensor> result  = repository.getRootSensors();

        System.out.println(result.toString());

        return result;
    }
}
