package all;

public class ClonePair10337 {

    Integer method1(String value){
      if (value == null)   return null;
      try {
        return Integer.parseInt(value);
      }
     catch (  Exception ex) {
        return null;
      }
    }

    Integer method2(String value){
      if (value != null) {
        try {
          return Integer.valueOf(value);
        }
     catch (    final NumberFormatException e) {
        }
      }
      return null;
    }
}
