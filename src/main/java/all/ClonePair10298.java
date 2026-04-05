package all;

public class ClonePair10298 {

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
