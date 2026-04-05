package all;

public class ClonePair10291 {

    Integer method1(String indent){
      if (indent == null) {
        return null;
      }
     else {
        try {
          return Integer.parseInt(indent);
        }
     catch (    NumberFormatException e) {
          return null;
        }
      }
    }

    @SuppressWarnings("nls") Integer method2(String str){
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
}
