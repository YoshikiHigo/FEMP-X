package unverified;

public class ClonePair4875 {

    int method1(int val,int size){
      if (val < 0 || val > size - 1) {
        while (val < 0)     val+=size;
        return val % size;
      }
      return val;
    }

    int method2(int number,int divisor){
      if (number >= 0) {
        return number % divisor;
      }
      return ((number % divisor) + divisor) % divisor;
    }
}
