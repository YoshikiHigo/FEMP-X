package unverified;

public class ClonePair8268 {

    boolean method1(String mask,String input){
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

    boolean method2(String simTypePattern,String simulationType){
      int len=simTypePattern != null ? simTypePattern.length() : 0;
      if (len == 0) {
        return false;
      }
     else   if (simTypePattern.charAt(len - 1) == '*') {
        return simulationType != null && simulationType.regionMatches(0,simTypePattern,0,len - 1);
      }
     else {
        return simTypePattern.equals(simulationType);
      }
    }
}
