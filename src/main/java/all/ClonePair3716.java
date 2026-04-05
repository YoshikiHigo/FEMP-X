package all;

import java.util.StringTokenizer;

public class ClonePair3716 {

    boolean method1(String theString,String firstToken){
      boolean result=false;
      if ((theString != null) && (firstToken != null)) {
        StringTokenizer st=new StringTokenizer(theString);
        result=(st.hasMoreTokens() && (st.nextToken().compareTo(firstToken) == 0));
      }
      return result;
    }

    boolean method2(String mask,String input){
      if (mask == null || input == null) {
        return false;
      }
      String lowerMask=mask.trim().toLowerCase();
      String lowerInput=input.trim().toLowerCase();
      int maskLen=lowerMask.length();
      int inputLen=lowerInput.length();
      if ((inputLen <= 0) || (maskLen <= 0)) {
        return false;
      }
      int maskIndex=0;
      int inputIndex=0;
      int nextMaskIndex=-1;
      int nextInputIndex=-1;
      char maskChar='\0';
      boolean doingAsterisk=false;
      while (true) {
        if (maskIndex >= maskLen) {
          if (doingAsterisk || (inputIndex >= inputLen))       return true;
          maskChar='\0';
        }
     else {
          maskChar=lowerMask.charAt(maskIndex);
        }
    switch (maskChar) {
    case '*':      doingAsterisk=true;
        nextMaskIndex=++maskIndex;
      nextInputIndex=inputIndex;
    break;
    default:if (inputIndex >= inputLen) return false;
    doingAsterisk=false;
    if (maskChar != lowerInput.charAt(inputIndex)) {
    if (nextMaskIndex != -1) {
    maskIndex=nextMaskIndex;
    inputIndex=nextInputIndex++;
    }
     else {
    return false;
    }
    if (inputIndex >= inputLen) {
    return false;
    }
    }
     else {
    maskIndex++;
    inputIndex++;
    }
    break;
    }
    }
    }
}
