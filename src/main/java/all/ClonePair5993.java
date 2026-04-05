package all;

public class ClonePair5993 {

    String method1(int n){
      if (n == 0)   return "0000";
      if (n < 10)   return "000" + String.valueOf(n);
      if (n < 100)   return "00" + String.valueOf(n);
      if (n < 1000)   return "0" + String.valueOf(n);
      return String.valueOf(n);
    }

    String method2(int value){
      String id="";
      if (value < 10) {
        id=id + "000" + value;
      }
     else   if (value < 100) {
        id=id + "00" + value;
      }
     else   if (value < 1000) {
        id=id + "0" + value;
      }
     else {
        id=id + value;
      }
      return id;
    }
}
