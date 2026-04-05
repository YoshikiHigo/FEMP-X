package all;

public class ClonePair4869 {

    int method1(int val,int size){
      if (val < 0 || val > size - 1) {
        while (val < 0)     val+=size;
        return val % size;
      }
      return val;
    }

    int method2(int first,int second){
      if (first < 0) {
        double ceil=Math.ceil(-1.0d * first / second);
        int howmany=(int)Math.round(ceil);
        return first + howmany * second;
      }
      return first % second;
    }
}
