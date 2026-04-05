package all;

public class ClonePair6790 {

    String method1(int num){
      int ones=num % 10;
      int tens=num % 100;
      String suffix=null;
    switch (ones) {
    case 1:    if (tens == 11)     suffix="th";
     else     suffix="st";
      break;
    case 2:if (tens == 12) suffix="th";
     else suffix="nd";
    break;
    case 3:if (tens == 13) suffix="th";
     else suffix="rd";
    break;
    default:suffix="th";
    }
    return num + suffix;
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
