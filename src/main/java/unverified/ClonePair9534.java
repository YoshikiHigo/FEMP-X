package unverified;

import java.util.*;

public class ClonePair9534 {

    String method1(Calendar cal){
      int month=cal.get(Calendar.MONTH) + 1;
      if (month < 10)   return "0" + Integer.toString(month);
     else   return Integer.toString(month);
    }

    String method2(Calendar c){
      int mois=c.get(Calendar.MONTH) + 1;
      if (mois < 10) {
        return "0" + mois;
      }
     else {
        return "" + mois;
      }
    }
}
