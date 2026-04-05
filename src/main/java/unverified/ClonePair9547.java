package unverified;

import java.util.*;

public class ClonePair9547 {

    String method1(Calendar c){
      int i=(c.get(Calendar.MONTH) + 1);
      String m;
      String d;
      if (i < 10) {
        m="0" + i;
      }
     else {
        m="" + i;
      }
      String y="" + c.get(Calendar.YEAR);
      i=c.get(Calendar.DATE);
      if (i < 10) {
        d="0" + i;
      }
     else {
        d="" + i;
      }
      return y + "-" + m+ "-"+ d;
    }

    String method2(Calendar date){
      String dateString="" + date.get(Calendar.YEAR) + "-";
      int month=date.get(Calendar.MONTH) + 1;
      if (month < 10)   dateString+="0";
      dateString+=month + "-";
      int day=date.get(Calendar.DAY_OF_MONTH);
      if (day < 10)   dateString+="0";
      dateString+=day;
      return dateString;
    }
}
