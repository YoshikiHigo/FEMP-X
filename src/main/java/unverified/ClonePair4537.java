package unverified;

public class ClonePair4537 {

    boolean method1(int year){
      if ((year % 4 == 0) && (year % 100 != 0))   return true;
      if (year % 400 == 0)   return true;
      return false;
    }

    boolean method2(int year){
      if (year % 400 == 0)   return true;
      if (year % 4 == 0)   return year % 100 != 0;
     else   return false;
    }
}
