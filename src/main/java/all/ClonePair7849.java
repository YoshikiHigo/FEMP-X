package all;

public class ClonePair7849 {

    int method1(int aSize,int aMinRecSize){
      int pMod=aSize % aMinRecSize;
      if (pMod != 0) {
        return aSize + aMinRecSize - pMod;
      }
      return aSize;
    }

    int method2(int length,int i){
      int r=length / i * i;
      if (r != length)   r+=i;
      return r;
    }
}
