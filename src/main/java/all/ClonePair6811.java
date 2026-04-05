package all;

public class ClonePair6811 {

    int method1(int i1,int i2,int i3){
      int max=i1;
      if (i2 > i1) {
        max=i2;
      }
      if (i3 > max) {
        max=i3;
      }
      return max;
    }

    int method2(int a,int b,int c){
      int max=0;
      if ((a >= b) && (a >= c)) {
        max=a;
      }
     else   if ((b >= a) && (b >= c)) {
        max=b;
      }
     else {
        max=c;
      }
      return max;
    }
}
