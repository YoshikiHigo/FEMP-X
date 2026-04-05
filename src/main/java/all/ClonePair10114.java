package all;

public class ClonePair10114 {

    Integer method1(String source){
      if (source == null) {
        return null;
      }
      try {
        return Integer.parseInt(source);
      }
     catch (  Exception e) {
        return null;
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
