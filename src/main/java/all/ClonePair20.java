package all;

public class ClonePair20 {

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
      try {
        return (Long.parseLong(text));
      }
     catch (  NumberFormatException e) {
        return null;
      }
    }
}
