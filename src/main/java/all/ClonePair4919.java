package all;

import java.util.*;

public class ClonePair4919 {

    Calendar method1(String s){
      try {
        int year=0, month=0, day=0;
        if (s.length() == 8) {
          year=Integer.parseInt(s.substring(0,4));
          month=Integer.parseInt(s.substring(4,6)) - 1;
          day=Integer.parseInt(s.substring(6,8));
        }
     else     if (s.length() == 6) {
          year=Integer.parseInt(s.substring(0,2));
          year+=((year > 70) ? 1900 : 2000);
          month=Integer.parseInt(s.substring(2,4)) - 1;
          day=Integer.parseInt(s.substring(4,6));
        }
     else     return null;
        Calendar c=new GregorianCalendar(year,month,day);
        return c;
      }
     catch (  NumberFormatException e) {
        return null;
      }
    }

    Calendar method2(String data){
      String[] fields=data.split(":");
      if (fields.length != 2)   return null;
      String[] date=fields[0].split("/");
      String[] time=fields[1].split("\\.");
      if (date.length != 3)   return null;
      if (time.length != 2)   return null;
      int year, month, day, hour, minute;
      try {
        year=Integer.parseInt(date[0]);
        month=Integer.parseInt(date[1]) - 1;
        day=Integer.parseInt(date[2]);
        hour=Integer.parseInt(time[0]);
        minute=Integer.parseInt(time[1]);
      }
     catch (  Exception e) {
        e.printStackTrace();
        return null;
      }
      Calendar cal=Calendar.getInstance();
      cal.set(Calendar.YEAR,year);
      cal.set(Calendar.MONTH,month);
      cal.set(Calendar.DAY_OF_MONTH,day);
      cal.set(Calendar.HOUR_OF_DAY,hour);
      cal.set(Calendar.MINUTE,minute);
      return cal;
    }
}
