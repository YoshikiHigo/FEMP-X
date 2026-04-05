package all;

public class ClonePair5090 {

    int method1(int valor,int modulo){
      int divisor=valor / modulo;
      int resultado=valor - (divisor * modulo);
      if (resultado < 0) {
        resultado=modulo + resultado;
      }
      return resultado;
    }

    int method2(int dd,int box){
      if (dd < 0) {
        if (dd % box != 0) {
          return box + dd % box;
        }
     else {
          return 0;
        }
      }
     else   if (dd >= box) {
        return dd % box;
      }
     else {
        return dd;
      }
    }
}
