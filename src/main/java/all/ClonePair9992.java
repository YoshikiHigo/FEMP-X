package all;

public class ClonePair9992 {

    int method1(int x){
      int t0, t1, q, y;
      if (x <= 1) {
        return x;
      }
      t1=0x10001 / x;
      y=0x10001 % x;
      if (y == 1) {
        return ((1 - t1) & 0xffff);
      }
      t0=1;
      do {
        q=x / y;
        x=x % y;
        t0+=q * t1;
        if (x == 1) {
          return t0;
        }
        q=y / x;
        y=y % x;
        t1+=q * t0;
      }
     while (y != 1);
      return ((1 - t1) & 0xffff);
    }

    int method2(int x){
      int t0, t1;
      int q, y;
      if (x <= 1)   return (x);
      t1=0x10001 / x;
      y=0x10001 % x;
      if (y == 1)   return ((1 - t1) & 0xFFFF);
      t0=1;
      do {
        q=x / y;
        x=x % y;
        t0+=q * t1;
        if (x == 1)     return (t0);
        q=y / x;
        y=y % x;
        t1+=q * t0;
      }
     while (y != 1);
      return ((1 - t1) & 0xFFFF);
    }
}
