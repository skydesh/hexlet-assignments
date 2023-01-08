package exercise;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Value;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

// BEGIN

// END
@AllArgsConstructor
@Getter
class Car {
    int id;
    String brand;
    String model;
    String color;
    User owner;

    public String serialize() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(this);
    }

    public static Car unserialize(String jsonRepresentation) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(jsonRepresentation, Car.class);
    }
    // BEGIN
    
    // END
}
