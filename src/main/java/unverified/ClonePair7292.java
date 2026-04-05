package unverified;

public class ClonePair7292 {

    Object method1(Object[] a_values,int a_index){
      if (a_values == null) {
        return null;
      }
      if (a_values.length > a_index) {
        return a_values[a_index];
      }
      return null;
    }

    Object method2(Object[] array,int pos){
      if ((array == null) || (array.length <= pos)) {
        return null;
      }
     else {
        return array[pos];
      }
    }
}
