package com.arengrd.sensorsapi.controllers;

import com.arengrd.sensorsapi.models.RootSensor;
import com.arengrd.sensorsapi.services.SensorsService;
import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@Slf4j
@RestController
@RequestMapping("sensors-api/v1/one")
@RequiredArgsConstructor
public class SensorsController {

    private final SensorsService service;

    public List<RootSensor> findOne() throws Exception {

        return service.getData();
    }
}
