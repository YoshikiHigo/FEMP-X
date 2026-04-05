package unverified;

public class ClonePair8425 {

    String method1(String pvString,String pvCuttingString){
      if ((pvString != null) && (pvCuttingString != null) && (pvString.endsWith(pvCuttingString))) {
        return pvString.substring(0,(pvString.length() - pvCuttingString.length()));
      }
     else {
        return pvString;
      }
    }

    String method2(String s,String strToRemove){
      if (s == null || strToRemove == null)   return s;
      if (s.length() < strToRemove.length())   return s;
      int subLoc=s.length() - strToRemove.length();
      if (s.substring(subLoc).equalsIgnoreCase(strToRemove))   return s.substring(0,subLoc);
      return s;
    }
}
