package all;

public class ClonePair2230 {

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

    boolean method2(byte[] text,byte[] password){
      if (text.length != password.length)   return false;
      for (int i=0; i < text.length && i < password.length; i++) {
        if (text[i] != password[i])     return false;
      }
      return true;
    }
}
