package com.arengrd.sensorsapi.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;


/**
 * RootSensor POJO
 */
@Data
@NoArgsConstructor
@SuperBuilder
@JsonIgnoreProperties(ignoreUnknown = true)
public class RootSensor {

    /**
     * id
     */
    private long id;
    /**
     * name
     */
    private String name;

    @JsonProperty("Broker Name")
    private String brokerName;

    @JsonProperty("Raw ID")
    private long rawId;





}
