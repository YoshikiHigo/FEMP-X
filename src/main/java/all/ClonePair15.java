package all;

public class ClonePair15 {

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

    Long method2(String text){
      if (text == null) {
        return null;
      }
      Long number=null;
      try {
        number=Long.valueOf(text);
      }
     catch (  NumberFormatException e) {
      }
      return number;
    }
}
