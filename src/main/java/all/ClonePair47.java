package all;

public class ClonePair47 {

    Long method1(String value){
      if (value != null) {
        try {
          return Long.parseLong(value);
        }
     catch (    NumberFormatException e) {
        }
      }
      return null;
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
