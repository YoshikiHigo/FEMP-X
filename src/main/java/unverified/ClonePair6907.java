package unverified;

public class ClonePair6907 {

    int method1(int a,int b){
      if (a == -1) {
        return (b);
      }
     else   if (b == -1) {
        return (a);
      }
     else   if (a < b) {
        return (a);
      }
     else {
        return (b);
      }
    }

    int method2(int a,int b){
      while (a != b) {
        if (a > b) {
          a=a - b;
        }
     else {
          b=b - a;
        }
      }
      return a;
    }
}
