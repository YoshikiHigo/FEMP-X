package unverified;

public class ClonePair5085 {

    int method1(int valor,int modulo){
      int divisor=valor / modulo;
      int resultado=valor - (divisor * modulo);
      if (resultado < 0) {
        resultado=modulo + resultado;
      }
      return resultado;
    }

    int method2(int x,int n){
      int y=x % n;
      if (y < 0) {
        y+=n;
      }
      return y;
    }
}
