package unverified;

public class ClonePair6576 {

    float method1(float[] v1,float[] v2){
      float result=0.0f;
      for (int i=0; i < v1.length; i++) {
        result+=v1[i] * v2[i];
      }
      return (result);
    }

    float method2(float[] o1,float[] o2){
      float t=0.0f;
      for (int i=0; i < o1.length; i++) {
        t+=(o1[i] * o2[i]);
      }
      return t;
    }
}
