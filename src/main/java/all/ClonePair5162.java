package all;

public class ClonePair5162 {

    boolean method1(int n){
      if (n == 1 || n == 2)   return true;
      for (int i=2; i < n; i++)   if (n % i == 0)   return false;
      return true;
    }

    boolean method2(int entityValue){
      boolean extra=false;
      if (entityValue < 128) {
    switch (entityValue) {
    case 34:case 38:case 60:case 62:      break;
    default:    extra=true;
    }
    }
    return extra;
    }
}
