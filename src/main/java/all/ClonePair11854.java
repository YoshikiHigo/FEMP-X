package all;

public class ClonePair11854 {

    String method1(String srcStr,String ch){
      if ((srcStr == null) || ("".equals(srcStr.trim()))) {
        return srcStr;
      }
      if ((ch == null) || ("".equals(ch))) {
        return srcStr;
      }
      if (ch.length() > srcStr.length()) {
        return srcStr;
      }
      if (srcStr.indexOf(ch) < 0) {
        return srcStr;
      }
      int chLen=ch.length();
      if (srcStr.indexOf(ch,0) == 0) {
        srcStr=srcStr.substring(chLen);
      }
      return srcStr;
    }

    String method2(String sSource,String sEndsWith){
      if (null == sSource)   return null;
     else   if (sEndsWith == null)   return sSource;
     else   if (sSource.length() < sEndsWith.length())   return sSource;
     else   if (sSource.endsWith(sEndsWith))   return sSource.substring(0,sSource.length() - sEndsWith.length());
     else   return sSource;
    }
}
