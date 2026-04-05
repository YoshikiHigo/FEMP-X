package unverified;

public class ClonePair3151 {

    float method1(float[] data){
      float max=data[0];
      for (int i=1; i < data.length; ++i)   if (data[i] > max)   max=data[i];
      return max;
    }

    float method2(float[] f){
      float highest=f[0];
      for (int i=1; i < f.length; i++) {
        if (f[i] > highest) {
          highest=f[i];
        }
      }
      return highest;
    }
}
