package all;

public class ClonePair8041 {

    int method1(String[] src,String search){
      if (search == null || src == null)   return -1;
      for (int i=0; i < src.length; i++) {
        if (src[i] != null && src[i].compareTo(search) == 0)     return i;
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
