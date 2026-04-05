package all;

public class ClonePair2232 {

    boolean method1(byte[] bytea,byte[] byteb){
      boolean equal=true;
      if (bytea.length == byteb.length) {
        for (int i=0; i < bytea.length; i++) {
          if (bytea[i] != byteb[i]) {
            equal=false;
            break;
          }
        }
      }
     else {
        equal=false;
      }
      return equal;
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
