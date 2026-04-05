package all;

public class ClonePair10461 {

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
      if (value == null) {
        return null;
      }
      try {
        return new Integer(value);
      }
     catch (  NumberFormatException e) {
        return null;
      }
    }
}
