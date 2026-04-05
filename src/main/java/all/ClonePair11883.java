package all;

public class ClonePair11883 {

    String method1(String source,String findToken,String replaceToken){
      if (source == null) {
        return null;
      }
      StringBuilder sb=null;
      int pos;
      do {
        if ((pos=source.indexOf(findToken)) < 0) {
          break;
        }
        if (sb == null) {
          sb=new StringBuilder();
        }
        if (pos > 0) {
          sb.append(source.substring(0,pos));
        }
        sb.append(replaceToken);
        source=source.substring(pos + findToken.length());
      }
     while (source.length() > 0);
      if (sb == null) {
        return source;
      }
     else {
        sb.append(source);
        return sb.toString();
      }
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
