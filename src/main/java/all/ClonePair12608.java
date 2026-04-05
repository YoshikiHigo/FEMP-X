package all;

public class ClonePair12608 {

    boolean method1(String str,String[] array){
      if (str == null || array == null) {
        return false;
      }
      for (  String a : array) {
        if (a.equals(str)) {
          return true;
        }
      }
      return false;
    }

    boolean method2(String searchFor,String[] searchIn){
      if ((searchIn == null) || (searchFor == null))   return false;
      for (int i=0; i < searchIn.length; i++) {
        if (searchIn[i].equals(searchFor))     return true;
      }
      return false;
    }
}
