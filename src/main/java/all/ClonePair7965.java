package all;

public class ClonePair7965 {

    int method1(int v,int dv){
      int newv=v + dv;
      if ((newv > v) != (dv > 0)) {
        newv=(dv < 0) ? Integer.MIN_VALUE : Integer.MAX_VALUE;
      }
      return newv;
    }

    int method2(int a,int b){
      int s=a + b;
      if (b >= 0)   return s >= a ? s : Integer.MAX_VALUE;
      return s < a ? s : Integer.MIN_VALUE;
    }
}
