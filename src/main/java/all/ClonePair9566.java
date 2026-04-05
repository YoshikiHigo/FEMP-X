package all;

public class ClonePair9566 {

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

    boolean method2(char[] a,char[] b){
      if (a == b)   return true;
      if ((a == null) || (b == null))   return false;
      int i=a.length;
      if (b.length != i)   return false;
      while (--i >= 0)   if (a[i] != b[i])   return false;
      return true;
    }
}
