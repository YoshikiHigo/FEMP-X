package all;

public class ClonePair10811 {

    int method1(String first,String second){
      char c1, c2;
      int N1, N2;
      int i1=0, i2=0;
      String num1, num2;
      int int1, int2;
      N1=first.length();
      N2=second.length();
      while (i1 < N1 && i2 < N2) {
        c1=first.charAt(i1);
        c2=second.charAt(i2);
        if (c1 >= '0' && c1 <= '9') {
          if ('9' < c2) {
            return -1;
          }
     else       if ('0' > c2) {
            return +1;
          }
     else {
            num1="";
            num2="";
            do {
              num1+=c1;
              i1++;
              if (i1 < N1) {
                c1=first.charAt(i1);
              }
            }
     while (i1 < N1 && c1 >= '0' && c1 <= '9');
            int1=Integer.parseInt(num1);
            do {
              num2+=c2;
              i2++;
              if (i2 < N2) {
                c2=second.charAt(i2);
              }
            }
     while (i2 < N2 && c2 >= '0' && c2 <= '9');
            int2=Integer.parseInt(num2);
            if (int1 < int2) {
              return -1;
            }
     else         if (int1 > int2) {
              return +1;
            }
          }
        }
     else     if (c1 < c2) {
          return -1;
        }
     else     if (c1 > c2) {
          return +1;
        }
     else {
          ++i1;
          ++i2;
        }
      }
      if (N1 < N2) {
        return -1;
      }
     else   if (N1 > N2) {
        return +1;
      }
      return 0;
    }

    int method2(String string1,String string2){
      final int n=Math.min(string1.length(),string2.length());
      for (int i=0; i < n; i++) {
        final char ch1=Character.toLowerCase(string1.charAt(i));
        final char ch2=Character.toLowerCase(string2.charAt(i));
        if (ch1 < ch2)     return (-1);
     else     if (ch1 > ch2)     return (+1);
      }
      if (string1.length() < string2.length())   return (-1);
      if (string1.length() > string2.length())   return (+1);
      return (0);
    }
}
