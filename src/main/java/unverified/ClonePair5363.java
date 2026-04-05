package unverified;

public class ClonePair5363 {

    boolean method1(int y){
      if (y % 100 == 0)   return (y % 400 == 0);
     else   return (y % 4 == 0);
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
