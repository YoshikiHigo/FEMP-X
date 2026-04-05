package all;

public class ClonePair3950 {

    int method1(byte[] a,byte[] b){
      boolean check=true;
      if (a.length < b.length)   return -1;
      for (int i=0; i < a.length - b.length + 1; i++) {
        if (a[i] == b[0]) {
          check=true;
          for (int e=0; e < b.length; e++) {
            if (a[i + e] != b[e]) {
              check=false;
            }
          }
          if (check)       return i;
        }
      }
      return -1;
    }

    int method2(byte[] източник,byte[] образец){
      int результат=-1;
      for (int i=0; i < (източник.length - (образец.length - 1)); ++i) {
        if (източник[i] == образец[0]) {
          boolean найдено=true;
          for (int j=1; j < образец.length; ++j) {
            if (източник[i + j] != образец[j]) {
              найдено=false;
              break;
            }
          }
          if (найдено) {
            результат=i;
            return результат;
          }
        }
      }
      return результат;
    }
}
