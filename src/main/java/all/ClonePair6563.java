package all;

public class ClonePair6563 {

    boolean method1(String str,String expr){
      if (str == null || expr == null) {
        return false;
      }
      return str.matches(expr);
    }

    boolean method2(String str,String pattern){
      if (str == null || pattern == null)   return false;
      String regexPattern=pattern.replaceAll("\\*",".*");
      return str.matches(regexPattern);
    }
}
