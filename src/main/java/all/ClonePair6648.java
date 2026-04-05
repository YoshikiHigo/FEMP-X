package all;

public class ClonePair6648 {

    boolean method1(Object[] array,Object element,int length){
      for (int i=0; i < length; i++) {
        if (element == array[i]) {
          return true;
        }
      }
      return false;
    }

    boolean method2(Object[] array,Object element,int length){
      for (int i=0; i < length; i++) {
        if (element == null) {
          if (array[i] == null) {
            return true;
          }
        }
     else     if (element.equals(array[i])) {
          return true;
        }
      }
      return false;
    }
}
