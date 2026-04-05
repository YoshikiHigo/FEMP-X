package unverified;

public class ClonePair6567 {

    float method1(float[] fila,float[] columna){
      float result=0;
      for (int i=0; i < fila.length; i++) {
        result+=fila[i] * columna[i];
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
