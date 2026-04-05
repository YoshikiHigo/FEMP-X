package unverified;

public class ClonePair8446 {

    String method1(String pvString,String pvCuttingString){
      if ((pvString != null) && (pvCuttingString != null) && (pvString.endsWith(pvCuttingString))) {
        return pvString.substring(0,(pvString.length() - pvCuttingString.length()));
      }
     else {
        return pvString;
      }
    }

    String method2(String sSource,String sEndsWith){
      if (null == sSource)   return null;
     else   if (sEndsWith == null)   return sSource;
     else   if (sSource.length() < sEndsWith.length())   return sSource;
     else   if (sSource.endsWith(sEndsWith))   return sSource.substring(0,sSource.length() - sEndsWith.length());
     else   return sSource;
    }
}
