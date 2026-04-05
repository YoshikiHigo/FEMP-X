package all;

public class ClonePair5650 {

    boolean method1(String str,boolean bDefValue){
      if (str == null) {
        return bDefValue;
      }
     else {
        str=str.trim().toLowerCase();
        if (str.equals("true") || str.equals("yes") || str.equals("checked")|| str.equals("on")|| str.startsWith("1")) {
          return true;
        }
     else     if (str.equals("false") || str.equals("no") || str.equals("off")|| str.equals("0")) {
          return false;
        }
     else {
          return bDefValue;
        }
      }
    }

    boolean method2(String booleanString,boolean defaultValue){
      boolean booleanValue=defaultValue;
      if (booleanString != null) {
        if (booleanString.equalsIgnoreCase("yes") || booleanString.equalsIgnoreCase("true") || booleanString.equals("1")) {
          booleanValue=true;
        }
     else     if (booleanString.equalsIgnoreCase("no") || booleanString.equalsIgnoreCase("false") || booleanString.equals("0")) {
          booleanValue=false;
        }
      }
      return booleanValue;
    }
}
