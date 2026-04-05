package all;

import java.util.Calendar;

public class ClonePair13637 {

    int method1(Calendar d1,Calendar d2){
      int day1=d1.get(Calendar.DATE);
      int month1=d1.get(Calendar.MONTH);
      int year1=d1.get(Calendar.YEAR);
      int day2=d2.get(Calendar.DATE);
      int month2=d2.get(Calendar.MONTH);
      int year2=d2.get(Calendar.YEAR);
      if (year1 != year2)   return year1 - year2;
      if (month1 != month2)   return month1 - month2;
      if (day1 != day2)   return day1 - day2;
      return 0;
    }

    int method2(Calendar c1,Calendar c2){
      int vDiff=c1.get(Calendar.YEAR) - c2.get(Calendar.YEAR);
      if (vDiff != 0)   return vDiff;
      if ((vDiff=c1.get(Calendar.MONTH) - c2.get(Calendar.MONTH)) != 0)   return vDiff;
      return c1.get(Calendar.DAY_OF_MONTH) - c2.get(Calendar.DAY_OF_MONTH);
    }
}
