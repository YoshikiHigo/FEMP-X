package all;

public class ClonePair10216 {

    Integer method1(String value){
      if (value != null) {
        try {
          return Integer.parseInt(value);
        }
     catch (    NumberFormatException e) {
        }
      }
      return null;
    }

    Integer method2(String str){
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
}
