package unverified;

public class ClonePair6705 {

    int method1(int a,int b,int c){
      int mi;
      mi=a;
      if (b < mi)   mi=b;
      if (c < mi)   mi=c;
      return mi;
    }

    int method2(int a,int b,int c){
      int minimum=a;
      if (b < minimum) {
        minimum=b;
      }
      if (c < minimum) {
        minimum=c;
      }
      return minimum;
    }
}
