package all;

public class ClonePair3069 {

    int method1(byte[] array,byte target,int start,int end){
      for (int i=end - 1; i >= start; i--) {
        if (array[i] == target) {
          return i;
        }
      }
      return -1;
    }

    int method2(byte[] a,byte v,int from,int to){
      for (int i=to - 1; i >= from; --i) {
        if (a[i] == v)     return i;
      }
      return -1;
    }
}
