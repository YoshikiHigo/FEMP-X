package unverified;

public class ClonePair6296 {

    String method1(int nb){
      String res="";
      if (nb < 10)   res="000";
     else   if (nb < 100)   res="00";
     else   if (nb < 1000)   res="0";
      return res + nb;
    }

    String method2(int i){
      if (i < 10) {
        return "000" + i;
      }
      if (i < 100) {
        return "00" + i;
      }
      if (i < 1000) {
        return "0" + i;
      }
      return String.valueOf(i);
    }
}
