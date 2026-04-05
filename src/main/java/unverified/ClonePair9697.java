package unverified;

public class ClonePair9697 {

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

    boolean method2(char[] newpass,char[] repass){
      boolean isCorrect=true;
      if (newpass.length != repass.length) {
        isCorrect=false;
      }
     else {
        for (int i=0; i < newpass.length; i++) {
          if (newpass[i] != repass[i]) {
            isCorrect=false;
          }
        }
      }
      return isCorrect;
    }
}
