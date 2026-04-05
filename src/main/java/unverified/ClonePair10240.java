package unverified;

public class ClonePair10240 {

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
      if (value != null) {
        try {
          return Integer.valueOf(value);
        }
     catch (    final NumberFormatException e) {
        }
      }
      return null;
    }
}
