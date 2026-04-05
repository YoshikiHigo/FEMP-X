package all;

public class ClonePair10263 {

    @SuppressWarnings("nls") Boolean method1(String str){
      if ((str != null) && (str.length() > 0)) {
        if (str.equalsIgnoreCase("0")) {
          return Boolean.FALSE;
        }
        if (str.equalsIgnoreCase("1")) {
          return Boolean.TRUE;
        }
        if (str.equalsIgnoreCase("true")) {
          return Boolean.TRUE;
        }
        if (str.equalsIgnoreCase("false")) {
          return Boolean.FALSE;
        }
      }
      return Boolean.FALSE;
    }

    Boolean method2(String value){
      Boolean ret=Boolean.FALSE;
      if (value != null) {
        value=value.trim();
        if (value.equals("1") || value.toLowerCase().equals("true")) {
          ret=Boolean.TRUE;
        }
     else     if (value.equals("0") || value.equals("false")) {
          ret=Boolean.FALSE;
        }
     else     ret=Boolean.valueOf(value);
      }
      return ret;
    }
}
