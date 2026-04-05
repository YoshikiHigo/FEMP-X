package unverified;

public class ClonePair9652 {

    double method1(double data[]){
      double max=data[0];
      for (int i=0; i < data.length; i++) {
        if (data[i] > max)     max=data[i];
      }
      return max;
    }

    double method2(double... values){
      double value=values[0];
      int len=values.length;
      for (int i=0; i < len; i++) {
        if (values[i] >= value)     value=values[i];
      }
      return value;
    }
}
