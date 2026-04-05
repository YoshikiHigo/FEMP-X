package all;

public class ClonePair10335 {

    int method1(String str1,String str2){
      int i1=0, i2=0;
      int len1=str1.length();
      int len2=str2.length();
      for (; ; ) {
        if (i1 == len1)     return i2 == len2 ? 0 : -1;
        if (i2 == len2)     return 1;
        int c1=str1.charAt(i1++);
        if (c1 >= 0xD800 && c1 < 0xDC00 && i1 < len1)     c1=(c1 - 0xD800) * 0x400 + (str1.charAt(i1++) - 0xDC00) + 0x10000;
        int c2=str2.charAt(i2++);
        if (c2 >= 0xD800 && c2 < 0xDC00 && i2 < len2)     c2=(c2 - 0xD800) * 0x400 + (str2.charAt(i2++) - 0xDC00) + 0x10000;
        if (c1 != c2)     return c1 < c2 ? -1 : 1;
      }
    }

    int method2(String first,String second){
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
}
