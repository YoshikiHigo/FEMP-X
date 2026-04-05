package unverified;

public class ClonePair6346 {

    int method1(int a,int b){
      int n=a / b;
      int result=a - n * b;
      if (result < 0)   return result + b;
      return result;
    }

    int method2(int dd,int box){
      if (dd < 0) {
        if (dd % box != 0) {
          return box + dd % box;
        }
     else {
          return 0;
        }
      }
     else   if (dd >= box) {
        return dd % box;
      }
     else {
        return dd;
      }
    }
}
