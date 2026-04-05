package unverified;

public class ClonePair7302 {

    boolean method1(String x,String y){
      if (x == null)   return y == null;
     else   if (y == null)   return false;
     else   if (y.length() <= 0)   return x.length() <= 0;
      char[] a=x.toCharArray();
      char[] b=y.toCharArray();
      char diff=(char)((a.length == b.length) ? 0 : 1);
      int j=0;
      for (int i=0; i < a.length; ++i) {
        diff|=a[i] ^ b[j];
        j=(j + 1) % b.length;
      }
      return diff == 0;
    }

    boolean method2(String stringA,String stringB){
      if (stringA == null) {
        if (stringB == null) {
          return true;
        }
     else {
          return false;
        }
      }
      if (stringB == null)   return false;
      if (stringA.compareTo(stringB) == 0) {
        return true;
      }
     else {
        return false;
      }
    }
}
