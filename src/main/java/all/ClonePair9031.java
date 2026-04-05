package all;

public class ClonePair9031 {

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

    int method2(String label1,String label2){
      int min=Math.min(label1.length(),label2.length());
      for (int i=0; i < min; i++) {
        char c1=label1.charAt(i);
        char c2=label2.charAt(i);
        if (c1 >= 'A' && c1 <= 'Z') {
          c1+='a' - 'A';
        }
        if (c2 >= 'A' && c2 <= 'Z') {
          c2+='a' - 'A';
        }
        if (c1 != c2) {
          return (c1 - c2);
        }
      }
      return (label1.length() - label2.length());
    }
}
