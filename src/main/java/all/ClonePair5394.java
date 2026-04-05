package all;

public class ClonePair5394 {

    int method1(int toMod,int mod){
      if (toMod > 0)   return toMod % mod;
     else   return (mod + (toMod % mod)) % mod;
    }

    int method2(int number,int divisor){
      if (number >= 0) {
        return number % divisor;
      }
      return ((number % divisor) + divisor) % divisor;
    }
}
