package unverified;

public class ClonePair5089 {

    int method1(int valor,int modulo){
      int divisor=valor / modulo;
      int resultado=valor - (divisor * modulo);
      if (resultado < 0) {
        resultado=modulo + resultado;
      }
      return resultado;
    }

    int method2(int x,int y){
      x=x % y;
      if (x < 0) {
        x+=y;
      }
      return x;
    }
}
