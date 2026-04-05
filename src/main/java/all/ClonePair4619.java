package all;

public class ClonePair4619 {

    boolean method1(int i){
    switch (i) {
    case 1:    return false;
    case 2:  return true;
    }
    if (i % 2 == 0) {
    return false;
    }
    for (int c=3; c <= Math.sqrt(i); c+=2) {
    if (i % c == 0) {
      return false;
    }
    }
    return true;
    }

    boolean method2(int numero){
      int raiz=(int)Math.sqrt(numero);
      if (numero == 1)   return false;
      if (raiz == 1 && numero != 1)   return true;
      if (numero % 2 == 0)   return false;
      for (int i=2; i <= raiz; i++) {
        if (numero % i == 0)     return false;
      }
      return true;
    }
}
