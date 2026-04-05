package unverified;

public class ClonePair1061 {

    int method1(Object[] array,Object object){
      for (int i=0; i < array.length; i++) {
        if (array[i] == object) {
          return i;
        }
        if (object != null && object.equals(array[i])) {
          return i;
        }
      }
      return -1;
    }

    int method2(Object[] keys,Object toFind){
      for (int i=0; i < keys.length; ++i) {
        if (toFind == null) {
          if (keys[i] == null)       return i;
        }
     else     if (toFind.equals(keys[i]))     return i;
      }
      return -1;
    }
}
