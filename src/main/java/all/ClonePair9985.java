package all;

import java.util.*;

public class ClonePair9985 {

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

    String[] method2(String str,char delim){
      List<String> res=new ArrayList<String>();
      String current="";
      char[] chars=str.toCharArray();
      for (int i=0; i < chars.length; i++) {
        char c=chars[i];
        if (c == '\\' && i + 1 < chars.length && chars[i + 1] == delim) {
          current+=delim;
          i++;
        }
     else     if (c == delim) {
          if (current.length() > 0) {
            res.add(current);
            current="";
          }
        }
     else {
          current+=c;
        }
      }
      if (current.length() > 0) {
        res.add(current);
      }
      return (res.toArray(new String[res.size()]));
    }
}
