package all;

public class ClonePair4073 {

    boolean method1(String[] path1,String[] path2){
      if (path1 == null || path2 == null) {
        return false;
      }
      if (path1.length != path2.length) {
        return false;
      }
      for (int i=0; i < path1.length; i++) {
        if (!path1[i].equals(path2[i])) {
          return false;
        }
      }
      return true;
    }

    boolean method2(String[] str1,String[] str2){
      if (str1 == null || str2 == null)   return false;
      if (str1.length != str2.length)   return false;
      for (int i=0; i < str1.length; i++) {
        if (!str1[i].equals(str2[i]))     return false;
      }
      return true;
    }
}
