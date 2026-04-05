package all;

public class ClonePair3784 {

    int method1(String toSearch,String[] whereToSearch){
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
