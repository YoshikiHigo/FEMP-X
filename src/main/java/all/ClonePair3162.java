package all;

public class ClonePair3162 {

    float method1(float[] data){
      float min=data[0];
      for (int i=1; i < data.length; ++i)   if (data[i] < min)   min=data[i];
      return min;
    }

    float method2(float[] a){
      float min=a[0];
      for (int i=0; i < a.length; i++) {
        if (min > a[i]) {
          min=a[i];
        }
      }
      return min;
    }
}
