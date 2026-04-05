package unverified;

public class ClonePair10450 {

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

    Integer method2(String value){
      if (value == null)   return null;
      try {
        return Integer.parseInt(value);
      }
     catch (  NumberFormatException nfe) {
        return null;
      }
    }
}
