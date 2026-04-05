package all;

public class ClonePair9593 {

    boolean method1(char[] a1,char[] a2){
      if (a1 == a2)   return true;
      if (null == a1 || null == a2)   return false;
      if (a1.length == a2.length) {
        int i=a1.length;
        while (--i >= 0)     if (a1[i] != a2[i])     return false;
        return true;
      }
      return false;
    }

    boolean method2(char[] secret1,char[] secret2){
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
}
