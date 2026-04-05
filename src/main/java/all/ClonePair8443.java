package all;

public class ClonePair8443 {

    String method1(String pvString,String pvCuttingString){
      if ((pvString != null) && (pvCuttingString != null) && (pvString.endsWith(pvCuttingString))) {
        return pvString.substring(0,(pvString.length() - pvCuttingString.length()));
      }
     else {
        return pvString;
      }
    }

    String method2(String string,String separator){
      if (string == null || separator == null)   return string;
      int k=string.lastIndexOf(separator);
      if (k < 0)   return string;
     else   return string.substring(0,k);
    }
}
