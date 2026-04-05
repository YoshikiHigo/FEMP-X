package unverified;

public class ClonePair9733 {

    boolean method1(char[] a1,char[] a2){
      if (a1 == a2) {
        return true;
      }
      try {
        if (a1.length == a2.length) {
          for (int i=0; i < a1.length; i++) {
            if (a1[i] != a2[i]) {
              return false;
            }
          }
          return true;
        }
      }
     catch (  NullPointerException e) {
      }
      return false;
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
