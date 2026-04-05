package unverified;

public class ClonePair4791 {

    double method1(double[] data){
      double max=data[0];
      for (int i=1; i < data.length; ++i)   if (data[i] > max)   max=data[i];
      return max;
    }

    double method2(double[] array){
      int len=array.length;
      int best=0;
      double max=array[0];
      for (int i=1; i < len; i++) {
        if (array[i] > max) {
          best=i;
          max=array[i];
        }
      }
      return max;
    }
}
