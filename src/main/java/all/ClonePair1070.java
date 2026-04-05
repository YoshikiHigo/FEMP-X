package all;

public class ClonePair1070 {

    int method1(Object[] array,Object value){
      for (int i=0; i < array.length; i++)   if (value != null) {
        if (value.equals(array[i]))     return i;
      }
     else {
        if (array[i] == null)     return i;
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
