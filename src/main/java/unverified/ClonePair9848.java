package unverified;

public class ClonePair9848 {

    boolean method1(char[] newpass,char[] repass){
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
