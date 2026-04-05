package unverified;

public class ClonePair7972 {

    int method1(int number,int divisor){
      if (number >= 0) {
        return number % divisor;
      }
      return ((number % divisor) + divisor) % divisor;
    }

    int method2(int at,int len){
      if (at < 0)   return (at % len + len) % len;
     else   return at % len;
    }
}
