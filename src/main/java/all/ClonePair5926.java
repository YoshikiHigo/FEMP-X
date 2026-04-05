package all;

public class ClonePair5926 {

    int method1(int a,int p){
      assert p >= 0;
      if (p == 0) {
        return 1;
      }
     else {
        int result=a;
        for (int i=1; i < p; ++i) {
          result=a * result;
        }
        return result;
      }
    }

    int method2(int a,int b){
      if (b == 0)   return 1;
      if (b == 1)   return a;
      int c=a;
      while (b > 1) {
        a=a * c;
        b--;
      }
      return a;
    }
}
