import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
    public static void main(String[] args) {

        String cpf = "www111.111.111-00www";

        String regex = "\\b([0-9]{3})\\.([0-9]{3})\\.([0-9]{3})\\-([0-9]{2})";

        Pattern pattern = Pattern.compile(regex);
        Matcher match = pattern.matcher(cpf);

        System.out.println(match.find());

    }
}