package com.arengrd.sensorsapi.repositories;


import com.arengrd.sensorsapi.models.RootSensor;

import java.util.List;

/**
 * Interface Rest Api Repository
 */
public interface UrbanObservatoryRepository {

    List<RootSensor> getRootSensors() throws Exception;
}
