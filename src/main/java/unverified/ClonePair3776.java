package unverified;

public class ClonePair3776 {

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

    int method2(String toSearch,String[] whereToSearch){
      int result=-1;
      if ((toSearch != null) && (whereToSearch != null)) {
        for (int i=0; (i < whereToSearch.length) && (result < 0); i++) {
          if (toSearch.equalsIgnoreCase(whereToSearch[i])) {
            result=i;
          }
        }
      }
      return result;
    }
}
