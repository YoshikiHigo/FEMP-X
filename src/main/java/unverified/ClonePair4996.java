package unverified;

public class ClonePair4996 {

    boolean method1(int year){
      boolean leap=false;
      if (year % 4 == 0) {
        if (year % 100 == 0) {
          if (year % 400 == 0) {
            leap=true;
          }
        }
     else {
          leap=true;
        }
      }
      return leap;
    }

    boolean method2(int year){
      boolean isDivisibleBy4=(year & 0x3) == 0;
      if (isDivisibleBy4) {
        boolean isCenturyYear=(year % 100 == 0);
        boolean isDivisibleBy400=(year % 400 == 0);
        return !(isCenturyYear && !isDivisibleBy400);
      }
     else {
        return false;
      }
    }
}
