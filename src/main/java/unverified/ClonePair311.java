package unverified;

public class ClonePair311 {

    boolean method1(byte[] b1,byte[] b2){
      int size1=b1.length;
      int size2=b2.length;
      if (size1 != size2) {
        return false;
      }
      for (int i=0; i < size1; i++) {
        if (b1[i] != b2[i]) {
          return false;
        }
      }
      return true;
    }

    boolean method2(byte[] text,byte[] password){
      if (text.length != password.length)   return false;
      for (int i=0; i < text.length && i < password.length; i++) {
        if (text[i] != password[i])     return false;
      }
      return true;
    }
}
