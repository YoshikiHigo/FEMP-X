package all;

import java.util.*;

public class ClonePair9987 {

    String[] method1(String str,char delim){
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
