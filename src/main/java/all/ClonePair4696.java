package all;

public class ClonePair4696 {

    boolean method1(int year){
      if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)   return true;
     else   return false;
    }

    boolean method2(int year){
      if (year % 4 == 0) {
        if (year < 1583)     return true;
     else {
          if ((year % 100 == 0) && (year % 400 != 0))       return false;
     else       return true;
        }
      }
     else {
        return false;
      }
    }
}
