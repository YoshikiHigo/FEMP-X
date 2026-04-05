package all;

public class ClonePair21 {

    Long method1(String value){
      if (value == null) {
        return null;
      }
      try {
        return Long.valueOf(value);
      }
     catch (  NumberFormatException e) {
        return null;
      }
    }

    Long method2(String value){
      if (value == null) {
        return null;
      }
      try {
        return new Long(value);
      }
     catch (  NumberFormatException e) {
        return null;
      }
    }
}
