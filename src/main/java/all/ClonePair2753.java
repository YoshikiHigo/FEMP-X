package all;

public class ClonePair2753 {

    boolean method1(byte[] text,byte[] password){
      if (text.length != password.length)   return false;
      for (int i=0; i < text.length && i < password.length; i++) {
        if (text[i] != password[i])     return false;
      }
      return true;
    }

    boolean method2(byte[] a,byte[] b){
      if (a.length != b.length)   return false;
      int len=a.length;
      for (int i=0; i < len; i++) {
        if (a[i] != b[i])     return false;
      }
      return true;
    }
}
