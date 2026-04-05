package unverified;

public class ClonePair5306 {

    boolean method1(int number){
      if (number == 2 || number == 3)   return true;
      if (number < 2 || (number & 1) == 0)   return false;
      if (number < 9)   return true;
      if (number % 3 == 0)   return false;
      int r=(int)Math.sqrt(number);
      int f=5;
      while (f <= r) {
        if (number % f == 0 || number % (f + 2) == 0)     return false;
        f+=6;
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
