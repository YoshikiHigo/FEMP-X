package unverified;

public class ClonePair4790 {

    double method1(double[] data){
      double max=data[0];
      for (int i=1; i < data.length; ++i)   if (data[i] > max)   max=data[i];
      return max;
    }

    double method2(double[] array){
      double max=array[0];
      for (  double d : array)   if (d > max)   max=d;
      return max;
    }
}
