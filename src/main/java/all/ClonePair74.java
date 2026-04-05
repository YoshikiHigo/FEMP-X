package all;

import java.util.*;

public class ClonePair74 {

    List<String> method1(String s){
      ArrayList<String> list=new ArrayList<String>();
      StringBuffer sb=new StringBuffer();
      boolean inQuote=false;
      final int limit=s.length();
      for (int i=0; i < limit; i++) {
        char c=s.charAt(i);
    switch (c) {
    case ' ':      if (inQuote)       sb.append(c);
     else       if (sb.length() > 0) {
            list.add(sb.toString());
            sb.setLength(0);
          }
        break;
    case '"':  if (inQuote) {
        if (sb.length() > 0) {
          list.add(sb.toString());
          sb.setLength(0);
        }
        inQuote=false;
      }
     else   inQuote=true;
    break;
    default:sb.append(c);
    break;
    }
    }
    if (sb.length() > 0) list.add(sb.toString());
    return list;
    }

    List<String> method2(String line){
      List<String> list=new ArrayList<String>();
      StringBuilder currentWord=new StringBuilder();
      boolean isInQuote=false;
      char previousChar=0;
      for (int i=0; i < line.length(); i++) {
        char ch=line.charAt(i);
        try {
          if (Character.isWhitespace(ch) && !isInQuote) {
            if (currentWord.length() > 0) {
              list.add(currentWord.toString());
            }
            currentWord.setLength(0);
            continue;
          }
          if (ch == '"' && previousChar != '\\') {
            if (isInQuote) {
              isInQuote=false;
              if (currentWord.length() > 0) {
                list.add(currentWord.toString());
                currentWord.setLength(0);
              }
            }
     else {
              isInQuote=true;
            }
            continue;
          }
          if (ch == '\\') {
            continue;
          }
          currentWord.append(ch);
        }
      finally {
          previousChar=ch;
        }
      }
      if (currentWord.length() > 0) {
        list.add(currentWord.toString());
      }
      return list;
    }
}
