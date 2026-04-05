package all;

import java.util.*;

public class ClonePair9465 {

    String method1(Calendar calend){
      String current;
      current=calend.get(Calendar.YEAR) + "-";
      if (calend.get(Calendar.MONTH) < 9)   current=current + "0";
      current=current + (calend.get(Calendar.MONTH) + 1) + "-";
      if (calend.get(Calendar.DAY_OF_MONTH) < 10)   current=current + "0";
      current=current + calend.get(Calendar.DAY_OF_MONTH);
      return current;
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
