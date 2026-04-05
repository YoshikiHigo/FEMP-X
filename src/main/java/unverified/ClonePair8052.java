package unverified;

public class ClonePair8052 {

    int method1(String[] list,String str){
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
