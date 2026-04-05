package unverified;

public class ClonePair9833 {

    boolean method1(char[] password1,char[] password2){
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
