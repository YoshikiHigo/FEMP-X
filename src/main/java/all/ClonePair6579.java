package all;

public class ClonePair6579 {

    float method1(float[] o1,float[] o2){
      float t=0.0f;
      for (int i=0; i < o1.length; i++) {
        t+=(o1[i] * o2[i]);
      }
      return t;
    }

    float method2(float[] a,float[] b){
      int length=a.length;
      float value=0;
      for (int i=0; i < length; ++i)   value+=a[i] * b[i];
      return value;
    }
}
