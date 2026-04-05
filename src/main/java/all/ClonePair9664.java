package all;

public class ClonePair9664 {

    boolean method1(char[] password1,char[] password2){
      if (password1.length != password2.length)   return false;
      for (int i=0; i < password2.length; i++) {
        if (password1[i] != password2[i])     return false;
      }
      return true;
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
