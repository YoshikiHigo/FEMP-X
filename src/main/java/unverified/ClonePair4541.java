package unverified;

public class ClonePair4541 {

    boolean method1(int year){
      if ((year % 4 == 0) && (year % 100 != 0))   return true;
      if (year % 400 == 0)   return true;
      return false;
    }

    boolean method2(int year){
      if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))   return true;
     else   return false;
    }
}
