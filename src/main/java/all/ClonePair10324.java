package all;

public class ClonePair10324 {

    Integer method1(String value){
      if (value == null)   return null;
      try {
        return Integer.parseInt(value);
      }
     catch (  Exception ex) {
        return null;
      }
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
