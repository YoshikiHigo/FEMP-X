package unverified;

public class ClonePair10327 {

    Integer method1(String value){
      if (value == null)   return null;
      try {
        return Integer.parseInt(value);
      }
     catch (  Exception ex) {
        return null;
      }
    }

    Integer method2(String data){
      if (data == null || data.length() == 0)   return null;
      try {
        return Integer.valueOf(data);
      }
     catch (  NumberFormatException e) {
        return null;
      }
    }
}
