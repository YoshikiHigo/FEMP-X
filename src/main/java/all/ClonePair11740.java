package all;

import java.util.ArrayList;

public class ClonePair11740 {

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

    String method2(String s,String sub,String with){
      int c=0;
      int i=s.indexOf(sub,c);
      if (i == -1) {
        return s;
      }
      StringBuffer buf=new StringBuffer(s.length() + with.length());
      int n=s.length();
      do {
        buf.append(s.substring(c,i));
        int beginChar=i > 0 ? s.charAt(i - 1) : -1;
        int m=i + sub.length();
        int endChar=m < n ? s.charAt(m) : -1;
        if (((beginChar == -1) || (!Character.isJavaIdentifierStart((char)beginChar))) && ((endChar == -1) || (!Character.isJavaIdentifierPart((char)endChar)))) {
          buf.append(with);
        }
     else {
          buf.append(sub);
        }
        c=i + sub.length();
      }
     while ((i=s.indexOf(sub,c)) != -1);
      if (c < s.length()) {
        buf.append(s.substring(c,s.length()));
      }
      return buf.toString();
    }
}
