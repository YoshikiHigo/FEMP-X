package all;

public class ClonePair5276 {

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

    boolean method2(String name1,String name2){
      int nameLen=name1.length();
      if (nameLen != name2.length()) {
        return false;
      }
      for (int i=nameLen - 1; i >= 0; i--) {
        char c1=name1.charAt(i);
        char c2=name2.charAt(i);
        if (c1 != c2) {
          if (c1 >= 'A' && c1 <= 'Z') {
            c1+=32;
          }
          if (c2 >= 'A' && c2 <= 'Z') {
            c2+=32;
          }
          if (c1 != c2) {
            return false;
          }
        }
      }
      return true;
    }
}
