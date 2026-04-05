package all;

public class ClonePair2288 {

    boolean method1(byte[] first,byte[] second){
      boolean out=first != null && second != null && first.length == second.length;
      for (int i=0; out && i < first.length; i++) {
        if (first[i] != second[i]) {
          out=false;
        }
      }
      return out;
    }

    boolean method2(byte[] array1,byte[] array2){
      boolean compareresult=false;
      if ((array1 != null) && (array2 != null) && (array1.length == array2.length)) {
        compareresult=true;
        for (int i=0; i < array1.length; i++) {
          if (array1[i] != array2[i]) {
            compareresult=false;
            break;
          }
        }
      }
      return compareresult;
    }
}
