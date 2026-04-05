package all;

public class ClonePair5068 {

    boolean method1(int candidate){
      if (candidate < 2) {
        return false;
      }
      if (candidate == 2) {
        return true;
      }
      if (candidate % 2 == 0) {
        return false;
      }
      int factor=3;
      double square=Math.ceil(Math.sqrt(candidate));
      while (factor <= square) {
        if (candidate % factor == 0)     return false;
        factor+=2;
      }
      return true;
    }

    boolean method2(int i){
      if (i == 2)   return true;
      if (i < 2 || i % 2 == 0)   return false;
      for (int stop=i, j=3; j < stop; stop=i / j, j+=2)   if (i % j == 0)   return false;
      return true;
    }
}
