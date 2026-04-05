package unverified;

public class ClonePair10239 {

    Integer method1(String s){
      try {
        if (s != null) {
          return Integer.decode(s);
        }
     else {
          return null;
        }
      }
     catch (  NumberFormatException e) {
        return null;
      }
    }

    Integer method2(String value){
      if (value == null) {
        return null;
      }
      try {
        return Integer.valueOf(value);
      }
     catch (  NumberFormatException ex) {
        return null;
      }
    }
}
