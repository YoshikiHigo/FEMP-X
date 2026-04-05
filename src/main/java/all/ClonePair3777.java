package all;

public class ClonePair3777 {

    int method1(String locale,String[] locales){
      if (locale == null || locales == null || locales.length == 0) {
        return -1;
      }
      for (int i=0; i < locales.length; i++) {
        if (locale.equals(locales[i])) {
          return i;
        }
      }
      return -1;
    }

    int method2(String a,String[] array){
      if (a == null || array == null) {
        return -1;
      }
      int result=-1;
      for (int i=0; i < array.length; i++) {
        if (array[i] != null && a.equals(array[i])) {
          result=i;
          break;
        }
      }
      return result;
    }
}
