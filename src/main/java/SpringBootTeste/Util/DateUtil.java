package SpringBootTeste.Util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtil {
    public String setLocalDateTimeToDataBaseStyle(LocalDateTime localdatetime){
        return DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(localdatetime);
    }
}
