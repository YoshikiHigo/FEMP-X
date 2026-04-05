package all;

public class ClonePair6574 {

    float method1(float[] vec1,float[] vec2){
      float result=0;
      for (int i=0; i < vec1.length; ++i) {
        result+=vec1[i] * vec2[i];
      }
      return result;
    }

    float method2(float[] a,float[] b){
      int length=a.length;
      float value=0;
      for (int i=0; i < length; ++i)   value+=a[i] * b[i];
      return value;
    }
}
