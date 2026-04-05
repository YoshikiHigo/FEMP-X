package all;

public class ClonePair5087 {

    int method1(int valor,int modulo){
      int divisor=valor / modulo;
      int resultado=valor - (divisor * modulo);
      if (resultado < 0) {
        resultado=modulo + resultado;
      }
      return resultado;
    }

    int method2(int x,int width){
      if (x >= 0 && x < width)   return x;
      x=x % width;
      if (x < 0)   x+=width;
      return x;
    }
}
