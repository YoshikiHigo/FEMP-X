package unverified;

public class ClonePair10702 {

    String method1(String s,String placeholder,String value){
      if (s == null)   return "";
      if (s.length() == 0)   return s;
      if (placeholder == null || placeholder.length() == 0)   return s;
      if (value == null)   value="";
      String result=s;
      int matchIndex=result.indexOf(placeholder);
      int plen=placeholder.length();
      while (matchIndex != -1) {
        result=result.substring(0,matchIndex) + value + result.substring(matchIndex + plen);
        matchIndex=result.indexOf(placeholder,matchIndex + plen);
      }
      return result;
    }

    String method2(String source,String src,String dest){
      if (source == null || "".equals(source)) {
        return "";
      }
      if (src == null || "".equals(src)) {
        return source;
      }
      String ret="";
      if (source.indexOf(src) != -1) {
        while (source.indexOf(src) != -1) {
          ret+=source.substring(0,source.indexOf(src));
          ret+=dest;
          source=source.substring(source.indexOf(src) + src.length(),source.length());
        }
        ret+=source;
      }
     else {
        ret=source;
      }
      return ret;
    }
}
