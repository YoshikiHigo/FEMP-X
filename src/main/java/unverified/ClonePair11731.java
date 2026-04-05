package unverified;

public class ClonePair11731 {

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

    String method2(int iValue){
      String suffix="th";
      if ((iValue < 4) || (iValue > 20)) {
    switch (iValue % 10) {
    case 1:      suffix="st";
        break;
    case 2:  suffix="nd";
    break;
    case 3:suffix="rd";
    break;
    default:break;
    }
    }
    return Integer.toString(iValue) + suffix;
    }
}
