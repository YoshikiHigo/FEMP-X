package unverified;

public class ClonePair5922 {

    int method1(int one,int two){
      if (one < 0 && two < 0)   return -1;
      if (one < 0)   return two;
      if (two < 0)   return one;
      return Math.min(one,two);
    }

    int method2(int a,int b){
      if (a >= 0 && b >= 0) {
        return (a < b) ? a : b;
      }
     else   if (a >= 0) {
        return a;
      }
     else   if (b >= 0) {
        return b;
      }
     else {
        return -1;
      }
    }
}
