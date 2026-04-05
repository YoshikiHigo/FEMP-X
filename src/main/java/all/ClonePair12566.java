package all;

public class ClonePair12566 {

    String method1(String str,String thisStr,String withThisStr){
      if ((str == null) || (thisStr == null) || (withThisStr == null)|| (str.length() == 0)|| (thisStr.length() == 0))   return str;
      for (int i=str.length() - 1; i >= 0; i--) {
        if (str.charAt(i) == thisStr.charAt(0))     if (str.substring(i).startsWith(thisStr)) {
          str=str.substring(0,i) + withThisStr + str.substring(i + thisStr.length());
          return str;
        }
      }
      return str;
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
