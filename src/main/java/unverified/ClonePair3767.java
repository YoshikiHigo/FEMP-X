package unverified;

public class ClonePair3767 {

    boolean method1(String prefix,String string){
      int index1=0;
      int index2=0;
      int length1=prefix.length();
      int length2=string.length();
      char ch1=' ';
      char ch2=' ';
      while (index1 < length1 && index2 < length2) {
        while (index1 < length1 && Character.isWhitespace(ch1=prefix.charAt(index1))) {
          index1++;
        }
        while (index2 < length2 && Character.isWhitespace(ch2=string.charAt(index2))) {
          index2++;
        }
        if (index1 == length1 && index2 == length2) {
          return true;
        }
        if (ch1 != ch2) {
          return false;
        }
        index1++;
        index2++;
      }
      if (index1 < length1 && index2 >= length2)   return false;
      return true;
    }

    boolean method2(String pattern,String input){
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
}
