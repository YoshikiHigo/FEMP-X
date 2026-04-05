package all;

public class ClonePair10740 {

    int method1(String lsz,String rsz){
      int lLen=lsz.length();
      int rLen=rsz.length();
      int len=0;
      if (lLen == 0 && rLen > 0)   return -1;
      if (rLen == 0 && lLen > 0)   return 1;
      if (lLen > rLen)   len=rLen;
     else   len=lLen;
      for (int i=0; i < len; i++)   if (lsz.charAt(i) > rsz.charAt(i))   return 1;
     else   if (lsz.charAt(i) < rsz.charAt(i))   return -1;
      return 0;
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
