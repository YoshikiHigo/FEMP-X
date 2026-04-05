package unverified;

public class ClonePair9035 {

    int method1(String s1,String s2){
      final int n1=s1.length(), n2=s2.length();
      final int lim=Math.min(n1,n2);
      for (int k=0; k < lim; k++) {
        char c1=s1.charAt(k);
        char c2=s2.charAt(k);
        if (c1 != c2) {
          c1=Character.toUpperCase(c1);
          c2=Character.toUpperCase(c2);
          if (c1 != c2) {
            c1=Character.toLowerCase(c1);
            c2=Character.toLowerCase(c2);
            if (c1 != c2) {
              return c1 - c2;
            }
          }
        }
      }
      return n1 - n2;
    }

    int method2(String s1,String s2){
      int n1=s1.length(), n2=s2.length();
      for (int i1=0, i2=0; i1 < n1 && i2 < n2; i1++, i2++) {
        char c1=s1.charAt(i1);
        char c2=s2.charAt(i2);
        if (c1 != c2) {
          c1=Character.toUpperCase(c1);
          c2=Character.toUpperCase(c2);
          if (c1 != c2) {
            c1=Character.toLowerCase(c1);
            c2=Character.toLowerCase(c2);
            if (c1 != c2) {
              return c1 - c2;
            }
          }
        }
      }
      return n1 - n2;
    }
}
