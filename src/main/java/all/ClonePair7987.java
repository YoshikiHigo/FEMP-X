package all;

import java.util.*;

public class ClonePair7987 {

    String method1(Date date){
      StringBuffer value=new StringBuffer();
      Calendar calendar=Calendar.getInstance();
      long l;
      calendar.setTime(date);
      value.append(calendar.get(Calendar.YEAR));
      l=calendar.get(Calendar.MONTH) + 1;
      if (l < 10) {
        value.append("0");
      }
      value.append(l);
      l=calendar.get(Calendar.DAY_OF_MONTH);
      if (l < 10) {
        value.append("0");
      }
      value.append(l);
      return value.toString();
    }

    String method2(Date date){
      Calendar cal=Calendar.getInstance();
      cal.setTime(date);
      String ret="";
      ret+=cal.get(Calendar.YEAR);
      if (cal.get(Calendar.MONTH) + 1 < 10)   ret+="0";
      ret+=(cal.get(Calendar.MONTH) + 1);
      if (cal.get(Calendar.DAY_OF_MONTH) < 10)   ret+="0";
      ret+=cal.get(Calendar.DAY_OF_MONTH);
      return ret;
    }
}
