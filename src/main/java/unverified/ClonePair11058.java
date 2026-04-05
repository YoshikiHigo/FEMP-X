package unverified;

public class ClonePair11058 {

    boolean method1(String[] list,String value){
      if (list == null || list.length == 0)   return false;
      boolean found=false;
      for (int i=0, len=list.length; i < len && !found; i++) {
        found=list[i].equals(value);
      }
      return found;
    }

    boolean method2(String[] args,String argument){
      if (args != null && args.length > 0) {
        for (int i=0; i < args.length; i++) {
          if (args[i].equalsIgnoreCase(argument)) {
            return true;
          }
        }
      }
      return false;
    }
}
