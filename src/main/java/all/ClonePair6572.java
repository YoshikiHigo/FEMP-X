package all;

public class ClonePair6572 {

    float method1(float[] vec1,float[] vec2){
      float result=0;
      for (int i=0; i < vec1.length; ++i) {
        result+=vec1[i] * vec2[i];
      }
      return result;
    }

    float method2(float[] o1,float[] o2){
      float t=0.0f;
      for (int i=0; i < o1.length; i++) {
        t+=(o1[i] * o2[i]);
      }
      return t;
    }
}
