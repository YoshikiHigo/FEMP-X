package all;

public class ClonePair10523 {

    Integer method1(String string){
      if (string == null)   return null;
      try {
        return new Integer(string.trim());
      }
     catch (  Exception e) {
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
