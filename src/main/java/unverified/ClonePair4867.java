package unverified;

public class ClonePair4867 {

    int method1(int val,int size){
      if (val < 0 || val > size - 1) {
        while (val < 0)     val+=size;
        return val % size;
      }
      return val;
    }

    int method2(int value,int maxSize){
      if (value < 0) {
        value=(((-value / maxSize) + 1) * maxSize) + value;
      }
     else   if (value >= maxSize) {
        value=(value - ((value / maxSize) * maxSize));
      }
      return value;
    }
}
