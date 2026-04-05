package all;

public class ClonePair3490 {

    boolean method1(short[] itemSet1,short[] itemSet2){
      if (itemSet2 == null)   return (false);
      int length1=itemSet1.length;
      int length2=itemSet2.length;
      if (length1 != length2)   return (false);
      for (int index=0; index < length1; index++) {
        if (itemSet1[index] != itemSet2[index])     return (false);
      }
      return (true);
    }

    boolean method2(short[] expected,short[] actual){
      if (actual == null) {
        return false;
      }
      if (actual.length != expected.length) {
        return false;
      }
      for (int i=0; i < expected.length; ++i) {
        if (expected[i] != actual[i]) {
          return false;
        }
      }
      return true;
    }
}
