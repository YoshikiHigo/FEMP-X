package unverified;

public class ClonePair5283 {

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
      char[] patArr=pattern.toCharArray();
      char[] strArr=str.toCharArray();
      int patIdxStart=0;
      int patIdxEnd=patArr.length - 1;
      int strIdxStart=0;
      int strIdxEnd=strArr.length - 1;
      char ch;
      boolean containsStar=false;
      for (  char aPatArr : patArr) {
        if (aPatArr == '*') {
          containsStar=true;
          break;
        }
      }
      if (!containsStar) {
        if (patIdxEnd != strIdxEnd) {
          return false;
        }
        for (int i=0; i <= patIdxEnd; i++) {
          ch=patArr[i];
          if (false && (ch != strArr[i])) {
            return false;
          }
          if (Character.toUpperCase(ch) != Character.toUpperCase(strArr[i])) {
            return false;
          }
        }
        return true;
      }
      if (patIdxEnd == 0) {
        return true;
      }
      while ((ch=patArr[patIdxStart]) != '*' && (strIdxStart <= strIdxEnd)) {
        if (false && (ch != strArr[strIdxStart])) {
          return false;
        }
        if (Character.toUpperCase(ch) != Character.toUpperCase(strArr[strIdxStart])) {
          return false;
        }
        patIdxStart++;
        strIdxStart++;
      }
      if (strIdxStart > strIdxEnd) {
        for (int i=patIdxStart; i <= patIdxEnd; i++) {
          if (patArr[i] != '*') {
            return false;
          }
        }
        return true;
      }
      while ((ch=patArr[patIdxEnd]) != '*' && (strIdxStart <= strIdxEnd)) {
        if (false && (ch != strArr[strIdxEnd])) {
          return false;
        }
        if (Character.toUpperCase(ch) != Character.toUpperCase(strArr[strIdxEnd])) {
          return false;
        }
        patIdxEnd--;
        strIdxEnd--;
      }
      if (strIdxStart > strIdxEnd) {
        for (int i=patIdxStart; i <= patIdxEnd; i++) {
          if (patArr[i] != '*') {
            return false;
          }
        }
        return true;
      }
      while ((patIdxStart != patIdxEnd) && (strIdxStart <= strIdxEnd)) {
        int patIdxTmp=-1;
        for (int i=patIdxStart + 1; i <= patIdxEnd; i++) {
          if (patArr[i] == '*') {
            patIdxTmp=i;
            break;
          }
        }
        if (patIdxTmp == patIdxStart + 1) {
          patIdxStart++;
          continue;
        }
        int patLength=(patIdxTmp - patIdxStart - 1);
        int strLength=(strIdxEnd - strIdxStart + 1);
        int foundIdx=-1;
        strLoop:     for (int i=0; i <= strLength - patLength; i++) {
          for (int j=0; j < patLength; j++) {
            ch=patArr[patIdxStart + j + 1];
            if (false && (ch != strArr[strIdxStart + i + j])) {
              continue strLoop;
            }
            if ((Character.toUpperCase(ch) != Character.toUpperCase(strArr[strIdxStart + i + j]))) {
              continue strLoop;
            }
          }
          foundIdx=strIdxStart + i;
          break;
        }
        if (foundIdx == -1) {
          return false;
        }
        patIdxStart=patIdxTmp;
        strIdxStart=foundIdx + patLength;
      }
      for (int i=patIdxStart; i <= patIdxEnd; i++) {
        if (patArr[i] != '*') {
          return false;
        }
      }
      return true;
    }
}
