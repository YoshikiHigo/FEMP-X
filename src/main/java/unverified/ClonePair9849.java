package unverified;

public class ClonePair9849 {

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

    boolean method2(char[] a,char[] b){
      if (a.length != b.length)   return false;
     else {
        for (int i=0; i < a.length; i++) {
          if (a[i] != b[i])       return false;
        }
        return true;
      }
    }
}
