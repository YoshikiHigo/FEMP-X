package all;

public class ClonePair12305 {

    boolean method1(String[] targets,String value,boolean ignoreCase){
      if (targets == null)   return false;
      for (  String target : targets) {
        if (ignoreCase) {
          if (value.equalsIgnoreCase(target))       return true;
        }
     else {
          if (value.equals(target))       return true;
        }
      }
      return false;
    }

    boolean method2(String[] array,String string,boolean ignore_case){
      if (array == null)   return false;
      for (  String element : array) {
        if (ignore_case ? string.equalsIgnoreCase(element) : string.equals(element)) {
          return true;
        }
      }
      return false;
    }
}
