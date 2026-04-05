package all;

public class ClonePair8316 {

    int method1(int data[]){
      int max=data[0];
      for (int i=0; i < data.length; i++) {
        if (data[i] > max)     max=data[i];
      }
      return max;
    }

    int method2(int... xs){
      int max=xs[0];
      for (int i=1; i < xs.length; ++i)   if (xs[i] > max)   max=xs[i];
      return max;
    }
}
