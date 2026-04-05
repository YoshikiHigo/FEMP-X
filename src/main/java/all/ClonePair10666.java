package all;

public class ClonePair10666 {

    double method1(double... values){
      double value=values[0];
      int len=values.length;
      for (int i=0; i < len; i++) {
        if (values[i] <= value)     value=values[i];
      }
      return value;
    }

    double method2(double ar[]){
      int i;
      double m;
      m=ar[0];
      for (i=1; i < ar.length; ++i) {
        if (m > ar[i])     m=ar[i];
      }
      return m;
    }
}
