package all;

public class ClonePair5923 {

    int method1(int one,int two){
      if (one < 0 && two < 0)   return -1;
      if (one < 0)   return two;
      if (two < 0)   return one;
      return Math.min(one,two);
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
