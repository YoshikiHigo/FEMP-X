package all;

public class ClonePair11047 {

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

    boolean method2(String[] list,String value){
      if (list == null || list.length == 0)   return false;
      boolean found=false;
      for (int i=0, len=list.length; i < len && !found; i++) {
        found=list[i].equals(value);
      }
      return found;
    }
}
