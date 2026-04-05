package unverified;

public class ClonePair12044 {

    String method1(String source,String mark,String toMark){
      String result=source;
      int p=0;
      while (source != null && mark != null && toMark != null) {
        p=result.indexOf(mark,p);
        if (p == -1) {
          break;
        }
        result=result.substring(0,p) + toMark + result.substring(p + mark.length());
        p+=toMark.length();
      }
      return result;
    }

    String method2(String str,String thisStr,String withThisStr){
      if ((str == null) || (thisStr == null) || (withThisStr == null)|| (str.length() == 0)|| (thisStr.length() == 0))   return str;
      for (int i=str.length() - 1; i >= 0; i--) {
        if (Character.toUpperCase(str.charAt(i)) == Character.toUpperCase(thisStr.charAt(0)))     if (str.substring(i).toUpperCase().startsWith(thisStr.toUpperCase())) {
          boolean isUpperCase=Character.isUpperCase(str.charAt(i));
          if (withThisStr.length() > 0)       withThisStr=(isUpperCase ? Character.toUpperCase(withThisStr.charAt(0)) : Character.toLowerCase(withThisStr.charAt(0))) + withThisStr.substring(1);
          str=str.substring(0,i) + withThisStr + str.substring(i + thisStr.length());
        }
      }
      return str;
    }
}
