package all;

public class ClonePair5395 {

    int method1(int toMod,int mod){
      if (toMod > 0)   return toMod % mod;
     else   return (mod + (toMod % mod)) % mod;
    }

    int method2(int at,int len){
      if (at < 0)   return (at % len + len) % len;
     else   return at % len;
    }
}
