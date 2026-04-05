package all;

public class ClonePair6580 {

    float method1(float[] o1,float[] o2){
      float t=0.0f;
      for (int i=0; i < o1.length; i++) {
        t+=(o1[i] * o2[i]);
      }
      return t;
    }

    float method2(float[] v1,float[] v2){
      float res=0;
      for (int i=0; i < v1.length; i++)   res+=v1[i] * v2[i];
      return res;
    }
}
