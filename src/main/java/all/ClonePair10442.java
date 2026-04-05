package all;

public class ClonePair10442 {

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

    Integer method2(String s){
      if (s == null)   return null;
      Integer rval=null;
      try {
        rval=new Integer(s);
      }
     catch (  NumberFormatException e) {
        return null;
      }
      return rval;
    }
}
