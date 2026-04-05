package unverified;

public class ClonePair6583 {

    int method1(int a,int b){
      while (a != 0 && b != 0) {
        if (a >= b) {
          a=a % b;
        }
     else {
          b=b % a;
        }
      }
      return a + b;
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
