package unverified;

public class ClonePair6569 {

    float method1(float[] fila,float[] columna){
      float result=0;
      for (int i=0; i < fila.length; i++) {
        result+=fila[i] * columna[i];
      }
      return result;
    }

    float method2(float[] v1,float[] v2){
      float res=0;
      for (int i=0; i < v1.length; i++)   res+=v1[i] * v2[i];
      return res;
    }
}
