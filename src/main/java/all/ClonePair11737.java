package all;

public class ClonePair11737 {

    String method1(int num){
      String suffix="th";
    switch (num % 10) {
    case 1:    if (num % 100 != 11)     suffix="st";
      break;
    case 2:if (num % 100 != 12) suffix="nd";
    break;
    case 3:if (num % 100 != 13) suffix="rd";
    break;
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
