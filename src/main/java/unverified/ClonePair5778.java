package unverified;

public class ClonePair5778 {

    boolean method1(int year){
      if (year >= 1582) {
        return (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
      }
     else {
        return (year % 4 == 0);
      }
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
