package all;

public class ClonePair6769 {

    int method1(int a,int b,int c){
      int ma;
      ma=a;
      if (b > ma) {
        ma=b;
      }
      if (c > ma) {
        ma=c;
      }
      return ma;
    }

    int method2(int a1,int a2,int a3){
      if (a1 >= a2 && a1 >= a3) {
        return a1;
      }
     else   if (a2 >= a1 && a2 >= a3) {
        return a2;
      }
     else   return a3;
    }
}
