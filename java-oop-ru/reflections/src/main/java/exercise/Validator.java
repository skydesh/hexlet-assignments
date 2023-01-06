package exercise;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Validator {
    public static List<String> validate(Address address) throws IllegalAccessException {
        List<String> nullField = new ArrayList<>();
        for (Field field : address.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            NotNull notNull = field.getAnnotation(NotNull.class);
            if (field.get(address) == null && notNull != null) {
                nullField.add(field.getName());
            }
        }
        return nullField;
    }
}
// BEGIN

// END
