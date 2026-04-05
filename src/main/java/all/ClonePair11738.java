package all;

import java.util.ArrayList;

public class ClonePair11738 {

    String method1(String input,String word,String replaceWord){
      String output="";
      String tempInput=input.toLowerCase();
      String tempWord=word.toLowerCase();
      String tempReplaceWord=replaceWord.toLowerCase();
      ArrayList minus=new ArrayList();
      int fromIndex=0;
      int index=0;
      while (fromIndex < tempReplaceWord.length() && index >= 0) {
        index=tempReplaceWord.indexOf(tempWord,fromIndex);
        if (index >= 0) {
          minus.add(new Integer(index));
          fromIndex=index + tempWord.length();
        }
      }
      ArrayList occ=new ArrayList();
      boolean notApp;
      int i, beginIndex;
      fromIndex=0;
      index=0;
      while (fromIndex < tempInput.length() && index >= 0) {
        notApp=false;
        index=tempInput.indexOf(tempWord,fromIndex);
        if (index >= 0) {
          i=0;
          while (i < minus.size() && !notApp) {
            beginIndex=index - ((Integer)minus.get(i)).intValue();
            if (beginIndex >= 0) {
              if (input.startsWith(tempReplaceWord,beginIndex)) {
                notApp=true;
              }
            }
            i++;
          }
          if (!notApp) {
            occ.add(new Integer(index));
          }
        }
        fromIndex=index + tempWord.length();
      }
      if (occ.size() > 0) {
        output="";
        beginIndex=0;
        int endIndex=input.length();
        index=0;
        i=0;
        while (i < occ.size() && beginIndex < endIndex) {
          index=((Integer)occ.get(i)).intValue();
          if (index > 0) {
            output+=input.substring(beginIndex,index);
            output+=replaceWord;
          }
     else {
            output+=replaceWord;
          }
          beginIndex=index + word.length();
          i++;
        }
        if (beginIndex < endIndex) {
          output+=input.substring(beginIndex,endIndex);
        }
      }
     else {
        output=input;
      }
      return output;
    }

    String method2(String or,String ac,String ne){
      int orl=or.length();
      int acl=ac.length();
      StringBuilder resB=new StringBuilder();
      if (acl <= orl && or.lastIndexOf(ac) == orl - acl)   return resB.append(or.substring(0,or.length() - ac.length())).append(ne).toString();
      return or;
    }
}
