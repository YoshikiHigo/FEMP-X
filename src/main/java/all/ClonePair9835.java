package all;

public class ClonePair9835 {

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
      if (a.length != b.length)   return false;
     else {
        for (int i=0; i < a.length; i++) {
          if (a[i] != b[i])       return false;
        }
        return true;
      }
    }
}
