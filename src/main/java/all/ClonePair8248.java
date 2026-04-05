package all;

import java.util.*;

public class ClonePair8248 {

    String method1(int mm,int yy){
      if ((mm < 1) || (mm > 12)) {
        return "CreditCardExpMonth";
      }
      Calendar cal=Calendar.getInstance();
      int year=cal.get(Calendar.YEAR) - 2000;
      int month=cal.get(Calendar.MONTH) + 1;
      if (yy < year) {
        return "CreditCardExpired";
      }
     else   if ((yy == year) && (mm < month)) {
        return "CreditCardExpired";
      }
      return "";
    }

    String method2(int mm,int yy){
      if (mm < 1 || mm > 12)   return "CreditCardExpMonth";
      Calendar cal=Calendar.getInstance();
      int year=cal.get(Calendar.YEAR) - 2000;
      int month=cal.get(Calendar.MONTH) + 1;
      if (yy < year)   return "CreditCardExpired";
     else   if (yy == year && mm < month)   return "CreditCardExpired";
      return "";
    }
}
