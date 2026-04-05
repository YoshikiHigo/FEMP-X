package unverified;

public class ClonePair8412 {

    String method1(String pvString,String pvCuttingString){
      if ((pvString != null) && (pvCuttingString != null) && (pvString.endsWith(pvCuttingString))) {
        return pvString.substring(0,(pvString.length() - pvCuttingString.length()));
      }
     else {
        return pvString;
      }
    }

    String method2(String srcStr,String cutStr){
      if (srcStr == null || cutStr == null) {
        return srcStr;
      }
      String retStr=srcStr;
      if (retStr.endsWith(cutStr)) {
        retStr=retStr.substring(0,retStr.length() - cutStr.length());
      }
      return retStr;
    }
}
