package all;

public class ClonePair5550 {

    int method1(int year,int month){
      int day=0;
    switch (month) {
    case 1:case 3:case 5:case 7:case 8:case 10:case 12:    day=31;
      break;
    case 2:if ((year % 4) == 0) {
      if ((year % 100) == 0 && (year % 400) != 0) {
        day=28;
      }
     else {
        day=29;
      }
    }
     else {
      day=28;
    }
    break;
    default:day=30;
    }
    return day;
    }

    int method2(int tYear,int tMonth){
      int intDay=30;
      try {
        if (tMonth == 1 || tMonth == 3 || tMonth == 5 || tMonth == 7 || tMonth == 8 || tMonth == 10 || tMonth == 12)     intDay=31;
     else     if (tMonth == 2) {
          if (tYear % 400 == 0 || (tYear % 4 == 0 && tYear % 100 != 0)) {
            intDay=29;
          }
     else       intDay=28;
        }
     else     intDay=30;
      }
     catch (  Exception e) {
        return intDay;
      }
      return intDay;
    }
}
