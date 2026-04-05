package all;

public class ClonePair5477 {

    boolean method1(int year){
      if (year % 400 == 0)   return true;
     else   if (year % 100 == 0)   return false;
     else   if (year % 4 == 0)   return true;
     else   return false;
    }

    boolean method2(int year){
      boolean result=false;
      if (((year % 4) == 0) && (((year % 100) != 0) || ((year % 400) == 0))) {
        result=true;
      }
      return result;
    }
}
