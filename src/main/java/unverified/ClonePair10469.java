package unverified;

public class ClonePair10469 {

    Integer method1(String str){
      if (str == null || str.equals("")) {
        return null;
      }
      try {
        return Integer.valueOf(str);
      }
     catch (  NumberFormatException e) {
      }
      return null;
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
