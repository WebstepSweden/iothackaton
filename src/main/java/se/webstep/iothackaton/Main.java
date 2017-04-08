package se.webstep.iothackaton;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.module.paramnames.ParameterNamesModule;

/**
 * 2017-04-07, Created by Johannes.
 */
public class Main {

    public static void main(String[] args) {

        ObjectMapper objectMapper = new ObjectMapper()
                .registerModule(new ParameterNamesModule())
                .registerModule(new Jdk8Module())
                .registerModule(new JavaTimeModule());
        try {
            Sensors sensors = new Client().getSensors();
            Sensor sensor = new Client().getSensor("206847491");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
