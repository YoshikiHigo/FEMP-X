package unverified;

public class ClonePair5654 {

    boolean method1(int numero){
      int raiz=(int)Math.sqrt(numero);
      if (numero == 1)   return false;
      if (raiz == 1 && numero != 1)   return true;
      if (numero % 2 == 0)   return false;
      for (int i=2; i <= raiz; i++) {
        if (numero % i == 0)     return false;
      }
      return true;
    }

    boolean method2(int N){
      if (N == 2 || N == 3)   return true;
      if (N == 1 || N % 2 == 0)   return false;
      for (int i=3; i * i <= N; i+=2)   if (N % i == 0)   return false;
      return true;
    }
}
