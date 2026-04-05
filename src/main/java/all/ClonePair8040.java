package all;

public class ClonePair8040 {

    int method1(String[] src,String search){
      if (search == null || src == null)   return -1;
      for (int i=0; i < src.length; i++) {
        if (src[i] != null && src[i].compareTo(search) == 0)     return i;
      }
      return -1;
    }

    int method2(String[] array,String str){
      if (str == null || array == null || array.length == 0) {
        return -1;
      }
      for (int i=0; i < array.length; i++) {
        if (str.equals(array[i])) {
          return i;
        }
      }
      return -1;
    }
}
