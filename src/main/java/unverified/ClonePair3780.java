package unverified;

public class ClonePair3780 {

    int method1(String str,String[] strArray){
      if (str == null || strArray == null)   return -1;
      for (int i=0; i < strArray.length; i++) {
        if (str.equals(strArray[i]))     return i;
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
