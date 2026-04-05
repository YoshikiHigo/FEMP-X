package all;

public class ClonePair12481 {

    int method1(Object obj,Object[] array){
      if (obj == null || array == null) {
        return -1;
      }
      for (int i=0; i < array.length; i++) {
        if (obj.equals(array[i])) {
          return i;
        }
      }
      return -1;
    }

    int method2(Object o,Object[] os){
      if (o == null || os == null)   return -1;
      for (int i=0; i < os.length; i++) {
        if (o.equals(os[i]))     return i;
      }
      return -1;
    }
}
