package unverified;

public class ClonePair27 {

    Long method1(String text){
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

    Long method2(String value){
      if (value != null) {
        try {
          return Long.parseLong(value);
        }
     catch (    NumberFormatException e) {
        }
      }
      return null;
    }
}
