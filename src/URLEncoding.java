import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

/**
 * String last_name first_name patronymic birth_date
 */

public class URLEncoding {
    public static void main(String[] args) throws IOException {
        String last_name = args[0];
        String first_name = args[1];
        String patronymic = args[2];
        String birth_date = args[3];

        System.out.println("Before: " + last_name + " " + first_name + " " + patronymic + " " + birth_date);

        String last_name_utf8 = URLEncoder.encode(last_name, StandardCharsets.UTF_8.name());
        String first_name_utf8 = URLEncoder.encode(last_name, StandardCharsets.UTF_8.name());
        String patronymic_utf8 = URLEncoder.encode(last_name, StandardCharsets.UTF_8.name());

        System.out.println("After: " + last_name_utf8 + " " + first_name_utf8 + " " + patronymic_utf8 + " " + birth_date);
    }
}
