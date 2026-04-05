package unverified;

public class ClonePair9696 {

    boolean method1(char[] password,char[] verifyPassword){
      if (password.length != verifyPassword.length) {
        return false;
      }
      for (int i=0; i < password.length; i++) {
        if (password[i] != verifyPassword[i]) {
          return false;
        }
      }
      return true;
    }

    boolean method2(char[] src,char[] des){
      if (src.length != des.length)   return false;
      for (int i=src.length - 1; i >= 0; i--) {
        if (src[i] != des[i])     return false;
      }
      return true;
    }
}
