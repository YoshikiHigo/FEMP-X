package all;

public class ClonePair7851 {

    boolean method1(String actionMapping,String filterPath){
      boolean result=false;
      int index=actionMapping.indexOf(filterPath);
      if (index != -1)   result=true;
      if (index != 0 && index != -1)   if ("/".equals(actionMapping.charAt(index - 1)))   result=true;
     else   result=false;
      return result;
    }

    boolean method2(String day,String end){
      if (end.equals(""))   return true;
      if (day.compareToIgnoreCase(end) == 0)   return true;
      return false;
    }
}
