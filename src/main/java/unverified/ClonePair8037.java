package unverified;

public class ClonePair8037 {

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

    int method2(String[] list,String str){
      int pos=-1;
      if (list != null && list.length > 0) {
        for (int i=0; i < list.length; i++) {
          if (list[i] != null && list[i].equals(str)) {
            pos=i;
            break;
          }
        }
      }
      return pos;
    }
}
