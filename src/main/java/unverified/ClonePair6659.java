package unverified;

public class ClonePair6659 {

    boolean method1(String value1,String value2){
      try {
        if (value1 == null || value2 == null) {
          return false;
        }
     else     if (value1.trim().length() == 0 || value2.trim().length() == 0) {
          return false;
        }
     else {
          return value1.equals(value2);
        }
      }
     catch (  Exception e) {
        return false;
      }
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
