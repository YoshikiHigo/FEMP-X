package unverified;

public class ClonePair9620 {

    boolean method1(char[] b1,char[] b2){
      if (b1 == null) {
        return (b2 == null);
      }
     else   if (b2 == null) {
        return false;
      }
     else   if (b1 == b2) {
        return true;
      }
     else   if (b1.length != b2.length) {
        return false;
      }
      for (int i=0; i < b1.length; i++) {
        if (b1[i] != b2[i]) {
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
