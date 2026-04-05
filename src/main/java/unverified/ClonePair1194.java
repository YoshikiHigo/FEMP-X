package unverified;

public class ClonePair1194 {

    boolean method1(byte[] o1,byte[] o2){
      if (o1.length != o2.length) {
        return false;
      }
     else {
        for (int i=0; i < o1.length; i++) {
          if (o1[i] != o2[i]) {
            return false;
          }
        }
        return true;
      }
    }

    boolean method2(byte[] tom,byte[] jerry){
      boolean b=true;
      if (tom.length != jerry.length) {
        b=false;
      }
     else {
        for (int i=0; i < tom.length; i++) {
          if (tom[i] != jerry[i]) {
            b=false;
            break;
          }
        }
      }
      return b;
    }
}
