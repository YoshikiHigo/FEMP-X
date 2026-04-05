package unverified;

public class ClonePair12386 {

    String method1(String string,String toBeReplaced,String replacement){
      if (string == null || toBeReplaced == null || replacement == null)   return string;
      String tail=string;
      StringBuffer result=new StringBuffer(string.length() + replacement.length());
      int length=toBeReplaced.length();
      int begin;
      while (!tail.equals("")) {
        begin=tail.indexOf(toBeReplaced);
        if (begin == -1) {
          result.append(tail);
          return result.toString();
        }
        result.append(tail.substring(0,begin)).append(replacement);
        tail=tail.substring(begin + length);
      }
      return result.toString();
    }

    String method2(String str,String thisStr,String withThisStr){
      if ((str == null) || (thisStr == null) || (withThisStr == null)|| (str.length() == 0)|| (thisStr.length() == 0))   return str;
      for (int i=str.length() - 1; i >= 0; i--) {
        if (str.charAt(i) == thisStr.charAt(0))     if (str.substring(i).startsWith(thisStr)) {
          str=str.substring(0,i) + withThisStr + str.substring(i + thisStr.length());
          return str;
        }
      }
      return str;
    }
}
