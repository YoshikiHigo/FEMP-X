package all;

import java.util.*;

public class ClonePair9526 {

    String method1(Calendar calendar){
      String addS;
      Integer yyy=new Integer(calendar.get(Calendar.YEAR));
      String date=yyy.toString();
      Integer mmm=new Integer(calendar.get(Calendar.MONTH) + 1);
      addS=mmm.toString();
      if (addS.length() < 2)   addS='0' + addS;
      date+=addS;
      Integer ddd=new Integer(calendar.get(Calendar.DAY_OF_MONTH));
      addS=ddd.toString();
      if (addS.length() < 2)   addS='0' + addS;
      date+=addS;
      return date;
    }

    String method2(Calendar inDate){
      StringBuffer ret=new StringBuffer(8);
      ret.append(inDate.get(Calendar.YEAR));
      if (inDate.get(Calendar.MONTH) + 1 < 10) {
        ret.append('0');
      }
      ret.append((inDate.get(Calendar.MONTH) + 1));
      if (inDate.get(Calendar.DAY_OF_MONTH) < 10) {
        ret.append('0');
      }
      ret.append(inDate.get(Calendar.DAY_OF_MONTH));
      return ret.toString();
    }
}
