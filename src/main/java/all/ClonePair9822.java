package all;

public class ClonePair9822 {

    boolean method1(char[] src,char[] des){
      if (src.length != des.length)   return false;
      for (int i=src.length - 1; i >= 0; i--) {
        if (src[i] != des[i])     return false;
      }
      return true;
    }

    boolean method2(char[] password1,char[] password2){
      if (password1.length != password2.length) {
        return false;
      }
     else {
        for (int i=0; i < password1.length; i++) {
          if (password1[i] != password2[i])       return false;
        }
      }
      return true;
    }
}
