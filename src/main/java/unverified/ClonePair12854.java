package unverified;

public class ClonePair12854 {

    String method1(String input,String from,String to){
      assert from.length() == to.length();
      StringBuilder sb=null;
      int len=input.length();
      for (int i=0; i < len; i++) {
        int ind=from.indexOf(input.charAt(i));
        if (ind >= 0) {
          if (sb == null) {
            sb=new StringBuilder(input);
          }
          sb.setCharAt(i,to.charAt(ind));
        }
      }
      if (sb == null) {
        return input;
      }
     else {
        return sb.toString();
      }
    }

    String method2(String str,String regex,String replacement){
      int found=0;
      int start=0;
      int len=regex.length();
      if (str == "")   return "";
      while ((found=str.indexOf(regex,found)) != -1) {
        if (found + len >= str.length()) {
          return str.substring(0,found) + replacement;
        }
     else {
          str=str.substring(0,found) + replacement + str.substring(found + len);
        }
        found+=len;
      }
      return str;
    }
}
