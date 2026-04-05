package all;

public class ClonePair5269 {

    boolean method1(String pattern,String input){
      int patternIndex=0;
      int inputIndex=0;
      int patternLen=pattern.length();
      int inputLen=input.length();
      int[] stack=new int[100];
      int stacktop=0;
      for (; ; ) {
        if (patternIndex == patternLen) {
          if (inputIndex == inputLen) {
            return true;
          }
        }
     else {
          char patternChar=pattern.charAt(patternIndex);
          if (inputIndex < inputLen) {
            if (patternChar == '*') {
              stack[stacktop++]=patternIndex;
              stack[stacktop++]=inputIndex + 1;
              patternIndex++;
              continue;
            }
     else         if (patternChar == '?' || patternChar == input.charAt(inputIndex)) {
              patternIndex++;
              inputIndex++;
              continue;
            }
          }
     else       if (patternChar == '*') {
            patternIndex++;
            continue;
          }
        }
        if (stacktop == 0) {
          return false;
        }
        inputIndex=stack[--stacktop];
        patternIndex=stack[--stacktop];
      }
    }

    boolean method2(String pattern,String str){
      if (pattern.equals("*")) {
        return true;
      }
     else   if (pattern.startsWith("*")) {
        if (pattern.endsWith("*")) {
          if (pattern.length() == 2) {
            return true;
          }
          return str.indexOf(pattern.substring(1,pattern.length() - 1)) >= 0;
        }
        return str.endsWith(pattern.substring(1));
      }
     else   if (pattern.endsWith("*")) {
        return str.startsWith(pattern.substring(0,pattern.length() - 1));
      }
     else {
        return str.equals(pattern);
      }
    }
}
