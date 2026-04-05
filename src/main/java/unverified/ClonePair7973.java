package unverified;

public class ClonePair7973 {

    int method1(int number,int divisor){
      if (number >= 0) {
        return number % divisor;
      }
      return ((number % divisor) + divisor) % divisor;
    }

    int method2(int a,int b){
      int res=a % b;
      if (res < 0 && b > 0) {
        res+=b;
      }
      return res;
    }
}
