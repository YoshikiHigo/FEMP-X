package all;

import java.util.*;

public class ClonePair9986 {

    String[] method1(String str,char separator){
      int k;
      int l=0;
      Vector tokens=new Vector();
      while ((k=str.indexOf(separator,l)) != -1) {
        if (k > l) {
          tokens.addElement(str.substring(l,k));
        }
        l=k + 1;
        if (l == str.length()) {
          break;
        }
      }
      if (l < str.length()) {
        tokens.addElement(str.substring(l));
      }
      String[] tokenArray=new String[tokens.size()];
      tokens.copyInto(tokenArray);
      return tokenArray;
    }

    String[] method2(String rule,char mark){
      LinkedList<String> temp=new LinkedList<String>();
      String s="";
      for (int i=0; i < rule.length(); i++) {
        char chr=rule.charAt(i);
        if (chr == mark) {
          if (i > 0 && rule.charAt(i - 1) == '\\') {
            s+=chr;
          }
     else {
            if (s.compareTo("") != 0) {
              temp.add(s.trim());
              s="";
            }
          }
        }
     else {
          s+=chr;
        }
      }
      if (s.trim().compareTo("") != 0) {
        temp.add(s.trim());
      }
      if (temp.size() == 0) {
        return new String[0];
      }
     else {
        return temp.toArray(new String[0]);
      }
    }
}
