package all;

public class ClonePair6985 {

    int method1(int a,int b,int c){
      if (a <= b && a <= c)   return a;
     else   if (b <= c && b <= a)   return b;
     else   return c;
    }

    int method2(int a,int b,int c){
      if ((a <= b) && (a <= c)) {
        return a;
      }
      if ((b <= a) && (b <= c)) {
        return b;
      }
      return c;
    }
}
