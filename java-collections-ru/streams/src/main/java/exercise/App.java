package exercise;

import java.util.List;
import java.util.Arrays;

// BEGIN
public class App {


    public static int getCountOfFreeEmails(List<String> emails) {
        String[] emailsCom = {"gmail.com","yandex.ru","hotmail.com"};
        int count = 0;
        for (String elem : emailsCom) {
            count += emails.stream().filter(email -> email.endsWith(elem)).count();
        }
        return count;
}


}
// END
