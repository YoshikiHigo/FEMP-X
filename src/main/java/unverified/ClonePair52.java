package unverified;

public class ClonePair52 {

    Long method1(String text){
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
