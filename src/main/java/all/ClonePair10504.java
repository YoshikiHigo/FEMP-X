package all;

public class ClonePair10504 {

    Integer method1(String data){
      if (data == null || data.length() == 0)   return null;
      try {
        return Integer.valueOf(data);
      }
     catch (  NumberFormatException e) {
        return null;
      }
    }

    Integer method2(String value){
      if (value == null) {
        return null;
      }
      try {
        return Integer.valueOf(value);
      }
     catch (  NumberFormatException ex) {
        return null;
      }
    }
}
