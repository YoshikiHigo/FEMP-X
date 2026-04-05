package unverified;

public class ClonePair11727 {

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

    String method2(int n){
      if (n % 10 == 1 && n % 100 != 11) {
        return n + "st";
      }
      if (n % 10 == 2 && n % 100 != 12) {
        return n + "nd";
      }
      if (n % 10 == 3 && n % 100 != 13) {
        return n + "rd";
      }
      return n + "th";
    }
}
