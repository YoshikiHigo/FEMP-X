package all;

public class ClonePair2387 {

    boolean method1(byte[] b1,byte[] b2){
      if (b1.length != b2.length)   return false;
      for (int i=0; i < b1.length; i++)   if (b1[i] != b2[i])   return false;
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
