package unverified;

public class ClonePair4516 {

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

    boolean method2(String sub,String s){
      if (sub.length() != s.length())   return false;
      char[] csub=sub.toCharArray();
      char[] c=s.toCharArray();
      for (int i=0; i < csub.length; i++) {
        if (csub[i] != '0' && c[i] == '0')     return false;
      }
      return true;
    }
}
