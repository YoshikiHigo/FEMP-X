package all;

public class ClonePair6564 {

    float method1(float[] fila,float[] columna){
      float result=0;
      for (int i=0; i < fila.length; i++) {
        result+=fila[i] * columna[i];
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
