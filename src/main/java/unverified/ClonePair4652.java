package unverified;

public class ClonePair4652 {

    boolean method1(String string1,String string2){
      if (string1 == null && string2 == null) {
        return true;
      }
      if (string1 == null || string2 == null) {
        return false;
      }
      if ((string1.toLowerCase()).equals(string2.toLowerCase())) {
        return true;
      }
     else {
        return false;
      }
    }

    boolean method2(String x,String y){
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
}
