package equivalent;

import java.util.Calendar;

public class ClonePair9476 {
    String method1(Calendar inDate) {
        StringBuffer ret = new StringBuffer(8);
        ret.append(inDate.get(Calendar.YEAR));
        if (inDate.get(Calendar.MONTH) + 1 < 10) ret.append('0');
        ret.append((inDate.get(Calendar.MONTH) + 1));
        if (inDate.get(Calendar.DAY_OF_MONTH) < 10) ret.append('0');
        ret.append(inDate.get(Calendar.DAY_OF_MONTH));
        return ret.toString();
    }

    String method2(Calendar calendar) {
        String addS;
        Integer yyy = Integer.valueOf(calendar.get(Calendar.YEAR));
        String date = yyy.toString();
        Integer mmm = Integer.valueOf(calendar.get(Calendar.MONTH) + 1);
        addS = mmm.toString();
        if (addS.length() < 2) addS = '0' + addS;
        date += addS;
        Integer ddd = Integer.valueOf(calendar.get(Calendar.DAY_OF_MONTH));
        addS = ddd.toString();
        if (addS.length() < 2) addS = '0' + addS;
        date += addS;
        return date;
    }
}
