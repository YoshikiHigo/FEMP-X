package unverified;

public class ClonePair10444 {

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

    Integer method2(String string){
      if (string == null)   return null;
      try {
        return new Integer(string.trim());
      }
     catch (  Exception e) {
        return null;
      }
    }
}
