package unverified;

public class ClonePair10437 {

    @SuppressWarnings("nls") Integer method1(String str){
      if ((str != null) && (str.length() > 0)) {
        try {
          return Integer.valueOf(str);
        }
     catch (    NumberFormatException e) {
          e.printStackTrace();
        }
      }
      return null;
    }

    Integer method2(String response){
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
}
