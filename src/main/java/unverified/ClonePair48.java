package unverified;

public class ClonePair48 {

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
