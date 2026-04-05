package all;

public class ClonePair8034 {

    int method1(String[] array,String element){
      if (array == null || element == null) {
        return -1;
      }
      for (int i=0; i < array.length; i++) {
        if (element.equals(array[i])) {
          return i;
        }
      }
      return -1;
    }

    int method2(String[] src,String search){
      if (search == null || src == null)   return -1;
      for (int i=0; i < src.length; i++) {
        if (src[i] != null && src[i].compareTo(search) == 0)     return i;
      }
      return -1;
    }
}
