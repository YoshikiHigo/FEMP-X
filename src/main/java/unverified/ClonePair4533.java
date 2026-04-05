package unverified;

public class ClonePair4533 {

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

    boolean method2(String a,String b){
      if (a == b)   return true;
      String aw=a.split(" ",1)[0];
      String bw=b.split(" ",1)[0];
      return aw.compareTo(bw) == 0;
    }
}
