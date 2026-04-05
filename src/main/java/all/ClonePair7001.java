package all;

public class ClonePair7001 {

    int method1(int first,int second){
      int result;
      if ((first != -1) && (second != -1)) {
        if (first < second) {
          result=first;
        }
     else {
          result=second;
        }
      }
     else   if (first != -1) {
        result=first;
      }
     else {
        result=second;
      }
      return result;
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
