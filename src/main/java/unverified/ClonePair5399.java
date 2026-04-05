package unverified;

public class ClonePair5399 {

    int method1(int toMod,int mod){
      if (toMod > 0)   return toMod % mod;
     else   return (mod + (toMod % mod)) % mod;
    }

    int method2(int a,int b){
      int res=a % b;
      if (res < 0 && b > 0) {
        res+=b;
      }
      return res;
    }
}
