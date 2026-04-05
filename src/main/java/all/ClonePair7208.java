package all;

public class ClonePair7208 {

    boolean method1(String title1,String title2){
      if ((title1 == null) || (title2 == null)) {
        return false;
      }
      if ((title1.length() == 0) || (title2.length() == 0)) {
        return false;
      }
      if (Character.toUpperCase(title1.charAt(0)) != Character.toUpperCase(title2.charAt(0))) {
        return false;
      }
      return title1.substring(1).equals(title2.substring(1));
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
