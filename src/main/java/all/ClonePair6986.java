package all;

public class ClonePair6986 {

    int method1(int a,int b,int c){
      if (a <= b && a <= c)   return a;
     else   if (b <= c && b <= a)   return b;
     else   return c;
    }

    int method2(int i,int j,int k){
      if (i < j) {
        return (i < k) ? i : k;
      }
     else {
        return (j < k) ? j : k;
      }
    }
}
