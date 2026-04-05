package all;

public class ClonePair9698 {

    boolean method1(char[] password,char[] verifyPassword){
      if (password.length != verifyPassword.length) {
        return false;
      }
      for (int i=0; i < password.length; i++) {
        if (password[i] != verifyPassword[i]) {
          return false;
        }
      }
      return true;
    }

    boolean method2(char[] a,char[] b){
      int l_a=a.length;
      int l_b=b.length;
      if (l_a != l_b) {
        return false;
      }
      for (int i=0; i < l_a; i++) {
        if (a[i] != b[i]) {
          return false;
        }
      }
      return true;
    }
}
