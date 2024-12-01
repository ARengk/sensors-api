package com.arengrd.sensorsapi.services;



import com.arengrd.sensorsapi.models.RootSensor;

import java.util.List;


public interface SensorsService {

    List<RootSensor> getData() throws Exception;

}