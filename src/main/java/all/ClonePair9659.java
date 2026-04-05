package all;

public class ClonePair9659 {

    boolean method1(char[] password1,char[] password2){
      if (password1.length != password2.length)   return false;
      for (int i=0; i < password2.length; i++) {
        if (password1[i] != password2[i])     return false;
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
