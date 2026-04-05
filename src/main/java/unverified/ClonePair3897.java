package unverified;

public class ClonePair3897 {

    boolean method1(String fileName,String fileExtensions){
      if (fileExtensions == null || fileName == null) {
        return false;
      }
      String[] arr=fileExtensions.toUpperCase().split(" ");
      fileName=fileName.toUpperCase();
      for (  String elem : arr) {
        if (!"".equals(elem) && fileName.endsWith(elem)) {
          return true;
        }
      }
      return false;
    }

    boolean method2(String s1,String s2){
      if ((s1 == null) || (s2 == null)) {
        return false;
      }
      return (s1.length() == s2.length()) && (s1.toUpperCase().equals(s2.toUpperCase()));
    }
}
