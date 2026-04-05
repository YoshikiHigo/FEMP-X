package all;

public class ClonePair3775 {

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

    int method2(String str,String[] strArray){
      if (str == null || strArray == null)   return -1;
      for (int i=0; i < strArray.length; i++) {
        if (str.equals(strArray[i]))     return i;
      }
      return -1;
    }
}
