package all;

public class ClonePair5171 {

    boolean method1(int n){
      if (n == 1 || n == 2)   return true;
      for (int i=2; i < n; i++)   if (n % i == 0)   return false;
      return true;
    }

    boolean method2(int level){
      if (0 >= level || level <= 3) {
        return true;
      }
      return false;
    }
}
