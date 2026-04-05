package unverified;

public class ClonePair4870 {

    int method1(int val,int size){
      if (val < 0 || val > size - 1) {
        while (val < 0)     val+=size;
        return val % size;
      }
      return val;
    }

    int method2(int a,int b){
      int n=a / b;
      int result=a - n * b;
      if (result < 0)   return result + b;
      return result;
    }
}
