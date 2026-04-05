package unverified;

public class ClonePair4528 {

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

    boolean method2(String first,String second){
      boolean result=false;
      if (first.length() == 0) {
        return second.length() == 0;
      }
      if (second.length() == 0) {
        return first.length() == 0;
      }
      if (first.charAt(0) == '+') {
        first=first.substring(1);
      }
      if (second.charAt(0) == '+') {
        second=second.substring(1);
      }
      try {
        double d1=Double.parseDouble(first);
        double d2=Double.parseDouble(second);
        if (d1 == d2) {
          result=true;
        }
      }
     catch (  NumberFormatException e) {
        result=first.equals(second);
      }
      return result;
    }
}
