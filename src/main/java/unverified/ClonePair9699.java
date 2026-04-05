package unverified;

public class ClonePair9699 {

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

    boolean method2(char[] ch1,char[] ch2){
      if (ch1.length != ch2.length)   return false;
      for (int i=0; i < ch2.length; i++) {
        if (ch1[i] != ch2[i]) {
          return false;
        }
      }
      return true;
    }
}
