package all;

public class ClonePair4591 {

    boolean method1(String name,String template){
      int wildcardIdx=template.indexOf("*");
      if (wildcardIdx == -1)   return name.equals(template);
      boolean isBeginning=true;
      String beforeWildcard="";
      String afterWildcard=template;
      while (wildcardIdx != -1) {
        beforeWildcard=afterWildcard.substring(0,wildcardIdx);
        afterWildcard=afterWildcard.substring(wildcardIdx + 1);
        int beforeStartIdx=name.indexOf(beforeWildcard);
        if ((beforeStartIdx == -1) || (isBeginning && beforeStartIdx != 0)) {
          return false;
        }
        isBeginning=false;
        name=name.substring(beforeStartIdx + beforeWildcard.length());
        wildcardIdx=afterWildcard.indexOf("*");
      }
      return name.endsWith(afterWildcard);
    }

    boolean method2(String arg1,String arg2){
      if (arg1.length() > arg2.length())   return false;
      boolean returnArg=true;
      int i=0;
      int length=arg1.length();
      while (i < length) {
        char x=arg1.charAt(i);
        char y=arg2.charAt(i);
        if (x != y) {
          returnArg=false;
          break;
        }
        i+=1;
      }
      if (arg2.length() > length) {
        if (arg2.charAt(i) != '.')     returnArg=false;
      }
      return returnArg;
    }
}
