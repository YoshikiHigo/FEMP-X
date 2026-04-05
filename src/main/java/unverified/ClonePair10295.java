package unverified;

public class ClonePair10295 {

    Integer method1(String indent){
      if (indent == null) {
        return null;
      }
     else {
        try {
          return Integer.parseInt(indent);
        }
     catch (    NumberFormatException e) {
          return null;
        }
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
