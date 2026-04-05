package all;

public class ClonePair2551 {

    boolean method1(byte[] h1,byte[] h2){
      final int length=h1.length;
      if (length != h2.length) {
        return false;
      }
      for (int i=0; i < length; i++) {
        if (h1[i] != h2[i]) {
          return false;
        }
      }
      return true;
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
