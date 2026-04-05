package unverified;

public class ClonePair3071 {

    int method1(byte[] a,byte v,int from,int to){
      for (int i=from; i < to; ++i)   if (a[i] == v)   return i;
      return -1;
    }

    int method2(byte[] array,byte b,int fromIndex,int stopIndex){
      for (int position=fromIndex; position < stopIndex; position++) {
        if (array[position] == b) {
          return position;
        }
      }
      return -1;
    }
}
