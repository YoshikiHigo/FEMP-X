package unverified;

public class ClonePair5436 {

    boolean method1(int year){
      if (year % 400 == 0)   return true;
      if (year % 4 == 0)   return year % 100 != 0;
     else   return false;
    }

    boolean method2(int year){
      if ((year % 400) == 0)   return true;
     else   if ((year % 4) == 0) {
        if ((year % 100) == 0)     return false;
     else     return true;
      }
     else   return false;
    }
}
