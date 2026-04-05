package unverified;

import java.util.*;

public class ClonePair7249 {

    int method1(int month,int year){
    switch (month) {
    case 2:    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
          return 29;
        }
     else {
          return 28;
        }
    case 4:case 6:case 9:case 11:  return 30;
    default:return 31;
    }
    }

    int method2(int month,int year){
      GregorianCalendar c=new GregorianCalendar();
      if ((month == 4) || (month == 6) || (month == 9)|| (month == 11))   return 30;
      if (month == 2) {
        if (c.isLeapYear(year))     return 29;
     else     return 28;
      }
      return 31;
    }
}
