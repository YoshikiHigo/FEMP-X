package all;

public class ClonePair9825 {

    boolean method1(char[] src,char[] des){
      if (src.length != des.length)   return false;
      for (int i=src.length - 1; i >= 0; i--) {
        if (src[i] != des[i])     return false;
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
