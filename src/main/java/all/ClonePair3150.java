package all;

public class ClonePair3150 {

    float method1(float[] data){
      float max=data[0];
      for (int i=1; i < data.length; ++i)   if (data[i] > max)   max=data[i];
      return max;
    }

    float method2(float[] d){
      float dmax=d[0];
      for (int i=0; i < d.length; i++)   if (d[i] > dmax)   dmax=d[i];
      return dmax;
    }
}
