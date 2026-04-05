package unverified;

public class ClonePair2755 {

    boolean method1(byte[] text,byte[] password){
      if (text.length != password.length)   return false;
      for (int i=0; i < text.length && i < password.length; i++) {
        if (text[i] != password[i])     return false;
      }
      return true;
    }

    boolean method2(byte[] b1,byte[] b2){
      if (b1.length != b2.length)   return false;
      for (int i=0; i < b2.length; i++) {
        byte b=b2[i];
        if (b != b1[i])     return false;
      }
      return true;
    }
}
