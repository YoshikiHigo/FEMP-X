package all;

public class ClonePair8056 {

    int method1(int a,int b){
      while (a != b) {
        if (a > b) {
          a=a - b;
        }
     else {
          b=b - a;
        }
      }
      return a;
    }

    int method2(int a,int b){
      if (b == 0)   return a;
      if (a == 0)   return b;
      int aZeros=Integer.numberOfTrailingZeros(a);
      int bZeros=Integer.numberOfTrailingZeros(b);
      a>>>=aZeros;
      b>>>=bZeros;
      int t=(aZeros < bZeros ? aZeros : bZeros);
      while (a != b) {
        if ((a + 0x80000000) > (b + 0x80000000)) {
          a-=b;
          a>>>=Integer.numberOfTrailingZeros(a);
        }
     else {
          b-=a;
          b>>>=Integer.numberOfTrailingZeros(b);
        }
      }
      return a << t;
    }
}
