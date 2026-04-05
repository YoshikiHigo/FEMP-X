package all;

public class ClonePair4456 {

    double method1(double[] targets){
      double highest=targets[0];
      for (int i=1; i < targets.length; ++i)   if (highest < targets[i])   highest=targets[i];
      return highest;
    }

    double method2(double[] array){
      double max=array[0];
      for (  double d : array)   if (d > max)   max=d;
      return max;
    }
}
