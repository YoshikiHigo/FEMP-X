package unverified;

public class ClonePair6566 {

    float method1(float[] fila,float[] columna){
      float result=0;
      for (int i=0; i < fila.length; i++) {
        result+=fila[i] * columna[i];
      }
      return result;
    }

    float method2(float[] vec1,float[] vec2){
      float result=0;
      for (int i=0; i < vec1.length; ++i) {
        result+=vec1[i] * vec2[i];
      }
      return result;
    }
}
