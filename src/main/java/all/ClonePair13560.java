package all;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class ClonePair13560 {

    String[] method1(String input){
      if (input == null || "".equals(input)) {
        return new String[0];
      }
      List<String> tokenList=new ArrayList<String>();
      StringTokenizer tokenizer=new StringTokenizer(input," ");
      while (tokenizer.hasMoreElements()) {
        boolean quotedToken=false;
        String tokenString=tokenizer.nextToken();
        if (tokenString.startsWith("\"")) {
          quotedToken=true;
          tokenString=tokenString.substring(1);
          if (tokenString.endsWith("\"") && !tokenString.endsWith("\\\"")) {
            quotedToken=false;
            tokenString=tokenString.substring(0,tokenString.length() - 1);
          }
        }
        if (quotedToken) {
          boolean getNext=true;
          StringBuffer token=new StringBuffer(tokenString);
          while (getNext) {
            try {
              token.append(tokenizer.nextToken("\""));
              if (!token.toString().endsWith("\\\"")) {
                getNext=false;
              }
            }
     catch (        NoSuchElementException e) {
              break;
            }
          }
          tokenString=token.toString();
        }
        tokenList.add(tokenString);
      }
      String[] stringArray=(String[])tokenList.toArray(new String[]{});
      return stringArray;
    }

    String[] method2(String str){
      if (str == null || str.length() == 0)   return new String[0];
      if (str.endsWith("ies")) {
        return new String[]{str.substring(0,str.length() - 3) + 'y'};
      }
     else   if (str.endsWith("es")) {
        return new String[]{str.substring(0,str.length() - 2)};
      }
     else   if (str.endsWith("s") && !str.endsWith("ss")) {
        return new String[]{str.substring(0,str.length() - 1)};
      }
     else {
        return new String[]{str};
      }
    }
}
