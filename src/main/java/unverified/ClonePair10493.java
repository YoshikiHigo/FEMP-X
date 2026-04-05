package unverified;

public class ClonePair10493 {

    Integer method1(String response){
      if (response == null) {
        return null;
      }
      try {
        Integer parsed=Integer.parseInt(response);
        return parsed;
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
