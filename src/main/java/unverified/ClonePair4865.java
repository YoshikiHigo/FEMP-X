package unverified;

public class ClonePair4865 {

    int method1(int val,int size){
      if (val < 0 || val > size - 1) {
        while (val < 0)     val+=size;
        return val % size;
      }
      return val;
    }

    int method2(int dr,int size){
      if (dr < 0) {
        return dr + size * ((-2 * dr + size) / (2 * size));
      }
      return dr - size * ((2 * dr + size - 1) / (2 * size));
    }
}
