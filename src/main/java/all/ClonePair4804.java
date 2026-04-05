package all;

import java.util.Arrays;

public class ClonePair4804 {

    double method1(double[] doubles){
      double[] sorted=doubles.clone();
      Arrays.sort(sorted);
      if (doubles.length % 2 == 0) {
        return (sorted[doubles.length / 2 - 1] + sorted[doubles.length / 2]) / 2;
      }
     else {
        return sorted[doubles.length / 2];
      }
    }

    double method2(double[] da){
      double[] temp=da.clone();
      java.util.Arrays.sort(temp);
      int len=temp.length;
      if (len % 2 == 0) {
        return (temp[len / 2] + temp[len / 2 - 1]) / 2.0;
      }
     else {
        return temp[((int)Math.floor(len / 2.0))];
      }
    }
}
