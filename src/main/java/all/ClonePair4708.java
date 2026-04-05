package all;

import java.util.Arrays;

public class ClonePair4708 {

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
