package all;

public class ClonePair5487 {

    boolean method1(int year){
      if (year % 400 == 0)   return true;
     else   if (year % 100 == 0)   return false;
     else   if (year % 4 == 0)   return true;
     else   return false;
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
