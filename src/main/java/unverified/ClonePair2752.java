package unverified;

public class ClonePair2752 {

    boolean method1(byte[] text,byte[] password){
      if (text.length != password.length)   return false;
      for (int i=0; i < text.length && i < password.length; i++) {
        if (text[i] != password[i])     return false;
      }
      return true;
    }

    boolean method2(byte[] a,byte[] b){
      int size;
      if ((size=a.length) != b.length) {
        return false;
      }
      for (int i=0; i < size; i++) {
        if (a[i] != b[i]) {
          return false;
        }
      }
      return true;
    }
}
