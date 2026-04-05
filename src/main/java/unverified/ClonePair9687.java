package unverified;

public class ClonePair9687 {

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

    boolean method2(char[] c1,char[] c2){
      if (c1 == null)   return c2 == null;
      if (c2 == null)   return false;
      if (c1.length != c2.length)   return false;
      for (int i=0; i < c1.length; i++) {
        if (c1[i] != c2[i])     return false;
      }
      return true;
    }
}
