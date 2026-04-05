package unverified;

public class ClonePair11550 {

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
