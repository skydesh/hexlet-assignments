package exercise;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

public class App {
    public static void save(Path path, Car car) throws IOException {
        String car2 = car.serialize();
        Files.writeString(path, car2);
    }

    public static Car extract(Path path) throws IOException {
        String jsonRepresentation = Files.readString(path);
        return Car.unserialize(jsonRepresentation);
    }
}
// BEGIN

// END
