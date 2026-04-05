package unverified;

public class ClonePair4453 {

    double method1(double[] targets){
      double highest=targets[0];
      for (int i=1; i < targets.length; ++i)   if (highest < targets[i])   highest=targets[i];
      return highest;
    }

    double method2(double[] data){
      double max=data[0];
      for (int i=1; i < data.length; ++i)   if (data[i] > max)   max=data[i];
      return max;
    }
}
