package unverified;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import java.util.Vector;

public class ClonePair13559 {

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

    String[] method2(String input){
      if (input == null || "".equals(input)) {
        return new String[0];
      }
      Vector tokenVector=new Vector();
      StringTokenizer tokenizer=new StringTokenizer(input," ");
      while (tokenizer.hasMoreElements()) {
        String token=tokenizer.nextToken();
        boolean quotedToken=false;
        if (token.startsWith("\"")) {
          quotedToken=true;
          token=token.substring(1);
          if (token.endsWith("\"") && !token.endsWith("\\\"")) {
            quotedToken=false;
            token=token.substring(0,token.length() - 1);
          }
        }
        if (quotedToken) {
          boolean getNext=true;
          while (getNext) {
            try {
              token+=tokenizer.nextToken("\"");
              if (!token.endsWith("\\\"")) {
                getNext=false;
              }
            }
     catch (        NoSuchElementException e) {
              break;
            }
          }
        }
        tokenVector.addElement(token);
      }
      String[] stringArray=new String[tokenVector.size()];
      tokenVector.copyInto(stringArray);
      return stringArray;
    }
}
