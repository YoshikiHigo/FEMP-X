package equivalent;

import java.util.Date;

public class ClonePair6817 {
    boolean method1(Date fecha) {
        int año1 = new Date().getYear();
        int mes1 = new Date().getMonth();
        int dia1 = new Date().getDay();
        int año2 = fecha.getYear();
        int mes2 = fecha.getMonth();
        int dia2 = fecha.getDay();
        if (año1 == año2) {
            if (mes1 == mes2) {
                return dia1 == dia2;
            }
        }
        return false;
    }

    boolean method2(Date date) {
        Date today = new Date();
        return date.getYear() == today.getYear() && date.getMonth() == today.getMonth() && date.getDate() == today.getDate();
    }
}
