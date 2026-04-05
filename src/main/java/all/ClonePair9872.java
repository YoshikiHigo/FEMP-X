package all;

public class ClonePair9872 {

    String method1(String input,String search,String replace){
      if (input == null || search == null) {
        return input;
      }
      if (replace == null) {
        replace="";
      }
      int index=input.indexOf(search);
      if (index == -1) {
        return input;
      }
      StringBuffer out=new StringBuffer();
      int afterPrev=0;
      while (index != -1) {
        out.append(input.substring(afterPrev,index));
        out.append(replace);
        afterPrev=index + search.length();
        index=input.indexOf(search,afterPrev);
      }
      out.append(input.substring(afterPrev));
      return out.toString();
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
