package all;

public class ClonePair8342 {

    double method1(double[] v,int length){
      if (length == 0)   return 0.f;
      double sum=0;
      for (int i=0; i < length; ++i) {
        sum+=v[i];
      }
      return sum / length;
    }

    double method2(double[] values,int numValues){
      if (numValues == 0)   return 0;
      double total=0;
      for (int i=0; i < numValues; ++i)   total+=values[i];
      return total / numValues;
    }
}
