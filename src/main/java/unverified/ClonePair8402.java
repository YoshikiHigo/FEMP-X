package unverified;

public class ClonePair8402 {

    String method1(String pvString,String pvCuttingString){
      if ((pvString != null) && (pvCuttingString != null) && (pvString.endsWith(pvCuttingString))) {
        return pvString.substring(0,(pvString.length() - pvCuttingString.length()));
      }
     else {
        return pvString;
      }
    }

    String method2(String input,String tail){
      if (input == null || tail == null || !input.endsWith(tail))   return input;
      return input.substring(0,input.length() - tail.length());
    }
}
