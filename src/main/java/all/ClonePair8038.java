package all;

public class ClonePair8038 {

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
