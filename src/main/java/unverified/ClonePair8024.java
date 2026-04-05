package unverified;

import java.util.*;

public class ClonePair8024 {

    int method1(int monthNumber,int yearNumber){
      int ret=0;
    switch (monthNumber) {
    case 4:    ret=30;
      break;
    case 2:if (yearNumber % 4 == 0) {
      ret=29;
    }
     else {
      ret=28;
    }
    break;
    case 6:ret=30;
    break;
    case 9:ret=30;
    break;
    case 11:ret=30;
    break;
    default:ret=31;
    break;
    }
    return ret;
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
