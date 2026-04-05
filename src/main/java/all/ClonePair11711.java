package all;

public class ClonePair11711 {

    String method1(String initialString,String toReplace,String replacement){
      if (initialString == null) {
        return null;
      }
      if (toReplace != null && !(toReplace.equals("")) && replacement != null) {
        StringBuffer stb=new StringBuffer();
        int index=initialString.indexOf(toReplace);
        int oldIndex=0;
        while (index != -1) {
          stb.append(initialString.substring(oldIndex,index));
          stb.append(replacement);
          oldIndex=index + toReplace.length();
          index=initialString.indexOf(toReplace,index + toReplace.length());
        }
        stb.append(initialString.substring(oldIndex));
        return stb.toString();
      }
     else {
        return initialString;
      }
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
