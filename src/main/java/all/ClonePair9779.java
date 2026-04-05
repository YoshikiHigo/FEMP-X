package all;

public class ClonePair9779 {

    boolean method1(char[] first,char[] second){
      if (first == second) {
        return true;
      }
      if (first == null || second == null) {
        return false;
      }
      if (first.length != second.length) {
        return false;
      }
      for (int i=first.length; --i >= 0; ) {
        if (first[i] != second[i]) {
          return false;
        }
      }
      return true;
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
