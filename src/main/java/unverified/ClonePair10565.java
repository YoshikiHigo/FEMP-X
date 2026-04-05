package unverified;

public class ClonePair10565 {

    String method1(String s,String o,String n){
      if (s == null)   return null;
      int begin=s.indexOf(o);
      if (begin == -1)   return s;
      int end=begin + o.length();
      return (new StringBuffer(s)).replace(begin,end,n).toString();
    }

    String method2(String input,String forReplace,String replaceWith){
      if (input == null)   return null;
      StringBuffer result=new StringBuffer();
      boolean hasMore=true;
      while (hasMore) {
        int start=input.indexOf(forReplace);
        int end=start + forReplace.length();
        if (start != -1) {
          result.append(input.substring(0,start) + replaceWith);
          input=input.substring(end);
        }
     else {
          hasMore=false;
          result.append(input);
        }
      }
      if (result.toString().equals(""))   return input;
     else   return result.toString();
    }
}
