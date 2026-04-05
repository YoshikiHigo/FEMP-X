package all;

public class ClonePair8451 {

    String method1(String pvString,String pvCuttingString){
      if ((pvString != null) && (pvCuttingString != null) && (pvString.endsWith(pvCuttingString))) {
        return pvString.substring(0,(pvString.length() - pvCuttingString.length()));
      }
     else {
        return pvString;
      }
    }

    String method2(String text,String suffix){
      if (text == null) {
        return null;
      }
      if (suffix == null) {
        return text;
      }
      if (text.endsWith(suffix)) {
        return text.substring(0,text.length() - suffix.length());
      }
      return text;
    }
}
