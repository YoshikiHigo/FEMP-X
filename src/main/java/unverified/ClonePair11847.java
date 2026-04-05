package unverified;

public class ClonePair11847 {

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

    String method2(String srcStr,String cutStr){
      if (srcStr == null || cutStr == null) {
        return srcStr;
      }
      String retStr=srcStr;
      if (retStr.endsWith(cutStr)) {
        retStr=retStr.substring(0,retStr.length() - cutStr.length());
      }
      return retStr;
    }
}
