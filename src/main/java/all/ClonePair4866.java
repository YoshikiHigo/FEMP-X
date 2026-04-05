package all;

public class ClonePair4866 {

    int method1(int val,int size){
      if (val < 0 || val > size - 1) {
        while (val < 0)     val+=size;
        return val % size;
      }
      return val;
    }

    int method2(int toMod,int mod){
      if (toMod > 0)   return toMod % mod;
     else   return (mod + (toMod % mod)) % mod;
    }
}
