package unverified;

import java.util.*;

public class ClonePair5251 {

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

    boolean method2(String pName1,String pName2){
      String[] name1TokensArray=pName1.split(" ");
      String[] name2TokensArray=pName2.split(" ");
      Set<String> name1Set=new HashSet<String>();
      for (int i=0; i < name1TokensArray.length; i++) {
        name1Set.add(name1TokensArray[i]);
      }
      Set<String> name2Set=new HashSet<String>();
      for (int i=0; i < name2TokensArray.length; i++) {
        name2Set.add(name2TokensArray[i]);
      }
      int name1SetSize=name1Set.size();
      int name2SetSize=name2Set.size();
      if (Math.abs(name1SetSize - name2SetSize) > 1) {
        return false;
      }
      Set<String> nameASet=name1Set;
      Set<String> nameBSet=name2Set;
      if (name1SetSize > name2SetSize) {
        nameASet=name2Set;
        nameBSet=name1Set;
      }
      if (nameASet.containsAll(nameBSet)) {
        return true;
      }
      return false;
    }
}
