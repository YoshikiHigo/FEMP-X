package unverified;

public class ClonePair11049 {

    boolean method1(String[] interfaces,String intf){
      if (interfaces == null || interfaces.length <= 0) {
        return false;
      }
      for (int i=0; i < interfaces.length; i++) {
        if (interfaces[i].equals(intf)) {
          return true;
        }
      }
      return false;
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
