package all;

public class ClonePair11083 {

    boolean method1(String[] args,String argument){
      if (args != null && args.length > 0) {
        for (int i=0; i < args.length; i++) {
          if (args[i].equalsIgnoreCase(argument)) {
            return true;
          }
        }
      }
      return false;
    }

    boolean method2(String[] array,String text){
      if (array == null || array.length == 0)   return false;
      int arrayCount=array.length;
      int arrayIndex;
      for (arrayIndex=0; arrayIndex < arrayCount; arrayIndex++) {
        if (array[arrayIndex].equals(text))     return true;
      }
      return false;
    }
}
