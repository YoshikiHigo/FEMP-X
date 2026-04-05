package unverified;

public class ClonePair9739 {

    String method1(int i){
      if (i < 10) {
        return "000" + i;
      }
     else   if (i < 100) {
        return "00" + i;
      }
     else   if (i < 1000) {
        return "0" + i;
      }
     else {
        return "" + i;
      }
    }

    String method2(int i){
      if (i < 10)   return "000" + i;
      if (i < 100)   return "00" + i;
      if (i < 1000)   return "0" + i;
      return "" + i;
    }
}
