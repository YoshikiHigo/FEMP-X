package unverified;

public class ClonePair6565 {

    float method1(float[] fila,float[] columna){
      float result=0;
      for (int i=0; i < fila.length; i++) {
        result+=fila[i] * columna[i];
      }
      return result;
    }

    float method2(float[] v1,float[] v2){
      float result=0.0f;
      for (int i=0; i < v1.length; i++) {
        result+=v1[i] * v2[i];
      }
      return (result);
    }
}
