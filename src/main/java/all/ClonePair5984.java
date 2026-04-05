package all;

public class ClonePair5984 {

    String method1(int n){
      if (n == 0)   return "0000";
      if (n < 10)   return "000" + String.valueOf(n);
      if (n < 100)   return "00" + String.valueOf(n);
      if (n < 1000)   return "0" + String.valueOf(n);
      return String.valueOf(n);
    }

    String method2(int i){
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
}
