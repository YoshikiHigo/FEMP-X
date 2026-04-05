package unverified;

public class ClonePair8450 {

    String method1(String pvString,String pvCuttingString){
      if ((pvString != null) && (pvCuttingString != null) && (pvString.endsWith(pvCuttingString))) {
        return pvString.substring(0,(pvString.length() - pvCuttingString.length()));
      }
     else {
        return pvString;
      }
    }

    String method2(String text,String separator){
      int index;
      if ((text == null) || (separator == null)) {
        return text;
      }
      index=text.lastIndexOf(separator);
      if (index < 0) {
        return text;
      }
      return text.substring(0,index);
    }
}
