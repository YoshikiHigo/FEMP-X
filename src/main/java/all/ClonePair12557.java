package all;

public class ClonePair12557 {

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

    String method2(String orig,String find,String replace){
      if (find == null || find.equals("")) {
        return orig;
      }
      if (replace == null) {
        replace="";
      }
      if (orig == null) {
        return null;
      }
      int origLength=orig.length();
      int findLength=find.length();
      StringBuffer replaced=new StringBuffer((int)(origLength * 2));
      int lastIndex=0;
      int indexOf=orig.indexOf(find,lastIndex);
      while (indexOf > -1) {
        replaced.append(orig.substring(lastIndex,indexOf));
        replaced.append(replace);
        lastIndex=indexOf + findLength;
        indexOf=orig.indexOf(find,lastIndex);
      }
      if (lastIndex < origLength) {
        replaced.append(orig.substring(lastIndex,origLength));
      }
      return replaced.toString();
    }
}
