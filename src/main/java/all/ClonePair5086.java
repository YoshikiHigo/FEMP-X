package all;

public class ClonePair5086 {

    int method1(int valor,int modulo){
      int divisor=valor / modulo;
      int resultado=valor - (divisor * modulo);
      if (resultado < 0) {
        resultado=modulo + resultado;
      }
      return resultado;
    }

    int method2(int a,int b){
      int n=a / b;
      int result=a - n * b;
      if (result < 0)   return result + b;
      return result;
    }
}
