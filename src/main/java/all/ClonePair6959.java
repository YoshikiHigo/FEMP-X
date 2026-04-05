package all;

public class ClonePair6959 {

    int method1(int a1,int a2,int a3){
      if (a1 >= a2 && a1 >= a3) {
        return a1;
      }
     else   if (a2 >= a1 && a2 >= a3) {
        return a2;
      }
     else   return a3;
    }

    int method2(int a,int b,int c){
      int max=0;
      if ((a >= b) && (a >= c)) {
        max=a;
      }
     else   if ((b >= a) && (b >= c)) {
        max=b;
      }
     else {
        max=c;
      }
      return max;
    }
}
