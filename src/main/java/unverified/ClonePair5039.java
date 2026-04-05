package unverified;

public class ClonePair5039 {

    boolean method1(int year){
      if (year % 4 != 0)   return false;
      if (year % 400 == 0)   return true;
      return year % 100 != 0;
    }

    boolean method2(int year){
      if ((year % 100) == 0)   return ((year % 400) == 0);
      return ((year % 4) == 0);
    }
}
