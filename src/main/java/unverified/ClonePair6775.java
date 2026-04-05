package unverified;

public class ClonePair6775 {

    int method1(int num1,int num2){
      if (num2 < num1) {
        return (int)((num2 - num1 + 1) * Math.random() + num1);
      }
     else {
        return (int)((num1 - num2 + 1) * Math.random() + num2);
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
