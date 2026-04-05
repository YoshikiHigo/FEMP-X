package all;

public class ClonePair1065 {

    int method1(Object[] array,Object element){
      if (array != null) {
        if (element == null) {
          for (int i=0, n=array.length; i < n; i++) {
            if (array[i] == null) {
              return i;
            }
          }
        }
     else {
          for (int i=0, n=array.length; i < n; i++) {
            if (element.equals(array[i])) {
              return i;
            }
          }
        }
      }
      return -1;
    }

    int method2(Object[] array,Object objectToFind){
      if (array == null)   return -1;
      if (objectToFind == null) {
        for (int i=0; i < array.length; i++)     if (array[i] == null)     return i;
      }
     else {
        for (int i=0; i < array.length; i++)     if (objectToFind.equals(array[i]))     return i;
      }
      return -1;
    }
}
