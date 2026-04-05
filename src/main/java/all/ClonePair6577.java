package all;

public class ClonePair6577 {

    float method1(float[] v1,float[] v2){
      float result=0.0f;
      for (int i=0; i < v1.length; i++) {
        result+=v1[i] * v2[i];
      }
      return (result);
    }

    float method2(float[] a,float[] b){
      int length=a.length;
      float value=0;
      for (int i=0; i < length; ++i)   value+=a[i] * b[i];
      return value;
    }
}
