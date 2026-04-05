package all;

public class ClonePair9682 {

    boolean method1(char[] secret1,char[] secret2){
      boolean result=false;
      if ((secret1 == null) || (secret2 == null)) {
        result=(secret1 == secret2);
      }
     else {
        if (secret1.length == secret2.length) {
          boolean equals=true;
          for (int i=0; (i < secret1.length) && equals; i++) {
            equals=(secret1[i] == secret2[i]);
          }
          result=equals;
        }
      }
      return result;
    }

    boolean method2(char[] password1,char[] password2){
      if (password1 == null && password2 == null) {
        return true;
      }
      if (password1 == null || password2 == null) {
        return false;
      }
      if (password1.length != password2.length) {
        return false;
      }
      for (int i=0; i < password1.length; i++) {
        if (password1[i] != password2[i]) {
          return false;
        }
      }
      return true;
    }
}
