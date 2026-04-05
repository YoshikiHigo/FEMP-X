package all;

public class ClonePair9705 {

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
