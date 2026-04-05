package all;

public class ClonePair4881 {

    int method1(int val,int size){
      if (val < 0 || val > size - 1) {
        while (val < 0)     val+=size;
        return val % size;
      }
      return val;
    }

    int method2(int at,int len){
      if (at < 0)   return (at % len + len) % len;
     else   return at % len;
    }
}
