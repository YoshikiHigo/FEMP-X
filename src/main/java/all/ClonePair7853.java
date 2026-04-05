package all;

public class ClonePair7853 {

    boolean method1(String actionMapping,String filterPath){
      boolean result=false;
      int index=actionMapping.indexOf(filterPath);
      if (index != -1)   result=true;
      if (index != 0 && index != -1)   if ("/".equals(actionMapping.charAt(index - 1)))   result=true;
     else   result=false;
      return result;
    }

    boolean method2(String s,String test){
      if (s.length() < test.length())   return false;
      for (int i=0; i < test.length(); i++) {
        if (Character.toUpperCase(s.charAt(i)) != Character.toUpperCase(test.charAt(i)))     return false;
      }
      return true;
    }
}
