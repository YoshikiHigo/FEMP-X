package unverified;

public class ClonePair1473 {

    boolean method1(byte[] b1,byte[] b2){
      boolean ret=b1.length == b2.length;
      for (int i=0; ret && i < b1.length; i++) {
        ret=b1[i] == b2[i];
      }
      return ret;
    }

    boolean method2(byte[] b1,byte[] b2){
      boolean ret=false;
      if (b1.length == b2.length) {
        ret=true;
        for (int i=0; i < b1.length && ret; i++) {
          if (b1[i] != b2[i])       ret=false;
        }
      }
      return ret;
    }
}
