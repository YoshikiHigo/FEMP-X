package all;

public class ClonePair9683 {

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

    boolean method2(char[] a,char[] a2){
      if (a == a2)   return true;
      if (a == null || a2 == null)   return false;
      int length=a.length;
      if (a2.length != length)   return false;
      for (int i=0; i < length; i++)   if (a[i] != a2[i])   return false;
      return true;
    }
}
