import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Number10 {
    public static void main(String[] args) {
        String some = "Мои номера `220-30-40` и `8904-378-16-61` не считая 2345656 89041234343 авп 8904321455 служебных";

        Pattern pattern_one = Pattern.compile("(8|\\+7)[-(\\s]*(\\d{3}[-)\\s]*){2}\\d{2}[-)\\s]*\\d{2}");
        Pattern pattern_two = Pattern.compile("[23][- ]?\\d{2}[- ]?\\d{2}[- ]?\\d{2}\\b");
        Matcher match_mob = pattern_one.matcher(some);
        Matcher match_home = pattern_two.matcher(some);

        while (match_mob.find()) {
            System.out.println(match_mob.group());
        }

        while (match_home.find()) {
            System.out.println(match_home.group());
        }
    }
}