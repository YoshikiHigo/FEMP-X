package all;

public class ClonePair7017 {

    int method1(Object[] array,Object element,int length){
      int elementCount=0;
      for (int i=0; i < length; i++) {
        if (element == array[i]) {
          elementCount++;
        }
      }
      return elementCount;
    }

    int method2(Object[] array,Object element,int length){
      int valueEqCount=0;
      for (int i=0; i < length; i++) {
        if (element == null) {
          if (array[i] == null) {
            valueEqCount++;
          }
        }
     else     if (element.equals(array[i])) {
          valueEqCount++;
        }
      }
      return valueEqCount;
    }
}
