package unverified;

public class ClonePair7063 {

    int method1(int i1,int i2){
      if (i1 < 0)   return i2;
      if (i2 < 0)   return i1;
      if (i1 > i2)   return i2;
      return i1;
    }

    int method2(int nEnd1,int nEnd2){
      if (nEnd1 >= 0 && nEnd2 >= 0) {
        if (nEnd1 < nEnd2)     return nEnd1;
        return nEnd2;
      }
      if (nEnd1 >= 0)   return nEnd1;
      if (nEnd2 >= 0)   return nEnd2;
      return -1;
    }
}
