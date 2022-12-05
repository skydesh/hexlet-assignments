package exercise;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

// BEGIN
public class App{
    public static String getForwardedVariables(String data){
        String env = Arrays.stream(data.split("\n"))
                .filter(el -> el.startsWith("environment"))
                .collect(Collectors.joining("\n"));
        env = env.replaceAll("\"", ",");
        List<String> stringList = Arrays.asList(env.split(","));
        return stringList.stream()
                .filter(element -> element.contains("X_"))
                .map(element -> element.replaceAll("X_FORWARDED_", ""))
                .collect(Collectors.joining(","));
    }
}
//END
