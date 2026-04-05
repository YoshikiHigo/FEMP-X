package all;

public class ClonePair5037 {

    int method1(int val,int limit){
      if (val > limit && limit != 0) {
        return limit;
      }
     else   if (val < 0) {
        return 0;
      }
      return val;
    }

    int method2(int a,int b){
      if (a == 0)   return b;
      int k=0, t=0;
      while ((a & 1) == 0 && (b & 1) == 0) {
        a/=2;
        b/=2;
        k++;
      }
      if ((a & 1) != 0)   t=-b;
     else   t=a;
      while (t != 0) {
        while ((t & 1) == 0)     t/=2;
        if (t > 0)     a=t;
     else     b=-t;
        t=a - b;
      }
      return a * (1 << k);
    }
}
