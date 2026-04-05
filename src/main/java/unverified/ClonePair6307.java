package unverified;

public class ClonePair6307 {

    String method1(int nb){
      String res="";
      if (nb < 10)   res="000";
     else   if (nb < 100)   res="00";
     else   if (nb < 1000)   res="0";
      return res + nb;
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
