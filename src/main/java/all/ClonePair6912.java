package all;

public class ClonePair6912 {

    int method1(int a,int b,int c){
      int minimum=a;
      if (b < minimum) {
        minimum=b;
      }
      if (c < minimum) {
        minimum=c;
      }
      return minimum;
    }

    int method2(int i1,int i2,int i3){
      if ((i1 < i2) && (i1 < i3))   return i1;
      return i2 < i3 ? i2 : i3;
    }
}
