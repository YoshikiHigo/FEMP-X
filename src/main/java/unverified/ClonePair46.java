package unverified;

public class ClonePair46 {

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

    Long method2(String string){
      if (string == null)   return null;
      try {
        return new Long(string);
      }
     catch (  NumberFormatException exception) {
        return null;
      }
    }
}
