package unverified;

public class ClonePair11552 {

    String method1(int i){
      String result="" + i;
      if (i > 3 && i < 20) {
        result+="th";
      }
     else   if (i % 10 == 1) {
        result+="st";
      }
     else   if (i % 10 == 2) {
        result+="nd";
      }
     else   if (i % 10 == 3) {
        result+="rd";
      }
     else {
        result+="th";
      }
      return result;
    }

    String method2(int number){
      int modulo=number % 100;
      if (modulo >= 11 && modulo <= 13)   return number + "th";
    switch (number % 10) {
    case 1:    return number + "st";
    case 2:  return number + "nd";
    case 3:return number + "rd";
    default:return number + "th";
    }
    }
}
