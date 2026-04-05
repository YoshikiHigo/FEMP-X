package all;

public class ClonePair9662 {

    boolean method1(char[] password1,char[] password2){
      if (password1.length != password2.length)   return false;
      for (int i=0; i < password2.length; i++) {
        if (password1[i] != password2[i])     return false;
      }
      return true;
    }

    boolean method2(char[] a1,char[] a2){
      if (a1.length != a2.length)   return false;
      for (int i=0; i < a1.length; i++)   if (a1[i] != a2[i])   return false;
      return true;
    }
}
