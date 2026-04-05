package unverified;

public class ClonePair3898 {

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

    boolean method2(String title1,String title2){
      if ((title1 == null) || (title2 == null)) {
        return false;
      }
      if ((title1.length() == 0) || (title2.length() == 0)) {
        return false;
      }
      if (Character.toUpperCase(title1.charAt(0)) != Character.toUpperCase(title2.charAt(0))) {
        return false;
      }
      return title1.substring(1).equals(title2.substring(1));
    }
}
