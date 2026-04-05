package all;

import java.util.Arrays;

public class ClonePair4707 {

    double method1(double[] data){
      int n=data.length;
      double[] data2=new double[n];
      System.arraycopy(data,0,data2,0,n);
      Arrays.sort(data2);
      boolean evenOrOdd=true;
      int n2=n / 2;
      double n3=n * 0.5;
      double MINVAL=0.00001;
      if (Math.abs(n2 - n3) > MINVAL) {
        evenOrOdd=false;
      }
      double result=0;
      if (evenOrOdd) {
        double a=data2[n2];
        double b=data2[n2 - 1];
        result=0.5 * (a + b);
      }
     else {
        int n4=(int)Math.floor(n3);
        result=data2[n4];
      }
      data2=null;
      return result;
    }

    double method2(double[] doubles){
      double[] sorted=doubles.clone();
      Arrays.sort(sorted);
      if (doubles.length % 2 == 0) {
        return (sorted[doubles.length / 2 - 1] + sorted[doubles.length / 2]) / 2;
      }
     else {
        return sorted[doubles.length / 2];
      }
    }
}
