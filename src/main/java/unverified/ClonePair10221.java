package unverified;

public class ClonePair10221 {

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
