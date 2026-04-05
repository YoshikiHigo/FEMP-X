package unverified;

public class ClonePair9577 {

    boolean method1(char[] ch1,char[] ch2){
      if (ch1 == null) {
        if (ch2 == null) {
          return true;
        }
     else {
          return false;
        }
      }
     else   if (ch2 == null) {
        return false;
      }
      if (ch1.length != ch2.length)   return false;
      for (int i=0; i < ch1.length; i++) {
        if (ch1[i] != ch2[i])     return false;
      }
      return true;
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
