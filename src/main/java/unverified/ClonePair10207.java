package unverified;

public class ClonePair10207 {

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

    Integer method2(String indent){
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
}
