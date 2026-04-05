package unverified;

public class ClonePair3161 {

    float method1(float[] data){
      float min=data[0];
      for (int i=1; i < data.length; ++i)   if (data[i] < min)   min=data[i];
      return min;
    }

    float method2(float[] d){
      float dmin=d[0];
      for (int i=0; i < d.length; i++)   if (d[i] < dmin)   dmin=d[i];
      return dmin;
    }
}
