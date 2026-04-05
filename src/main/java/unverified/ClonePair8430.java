package unverified;

public class ClonePair8430 {

    String method1(String pvString,String pvCuttingString){
      if ((pvString != null) && (pvCuttingString != null) && (pvString.endsWith(pvCuttingString))) {
        return pvString.substring(0,(pvString.length() - pvCuttingString.length()));
      }
     else {
        return pvString;
      }
    }

    String method2(String s,String suffix){
      if (s == null || s.length() == 0 || suffix == null || suffix.length() == 0)   return s;
      if (s.endsWith(suffix)) {
        return s.substring(0,s.length() - suffix.length());
      }
     else   return s;
    }
}
