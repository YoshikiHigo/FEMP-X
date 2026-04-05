package all;

public class ClonePair864 {

    boolean method1(byte[] one,byte[] two){
      if (one.length != two.length)   return false;
     else {
        for (int x=0; x < one.length; x++) {
          if (one[x] != two[x])       return false;
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
