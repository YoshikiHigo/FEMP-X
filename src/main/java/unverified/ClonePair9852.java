package unverified;

public class ClonePair9852 {

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

    boolean method2(char[] p1,char[] p2){
      boolean bMatch=true;
      if (p1.length == p2.length) {
        for (int i=0; i < p1.length; i++) {
          if (p1[i] != p2[i]) {
            bMatch=false;
            break;
          }
        }
      }
     else {
        bMatch=false;
      }
      return bMatch;
    }
}
