package unverified;

public class ClonePair9851 {

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

    boolean method2(char[] a1,char[] a2){
      if (a1.length != a2.length)   return false;
      for (int i=0; i < a1.length; i++)   if (a1[i] != a2[i])   return false;
      return true;
    }
}
