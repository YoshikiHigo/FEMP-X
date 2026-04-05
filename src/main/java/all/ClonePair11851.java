package all;

public class ClonePair11851 {

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

    String method2(String s,String strToRemove){
      if (s == null || strToRemove == null)   return s;
      if (s.length() < strToRemove.length())   return s;
      int subLoc=s.length() - strToRemove.length();
      if (s.substring(subLoc).equalsIgnoreCase(strToRemove))   return s.substring(0,subLoc);
      return s;
    }
}
