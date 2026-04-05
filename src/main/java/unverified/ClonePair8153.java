package unverified;

public class ClonePair8153 {

    boolean method1(String oldName,String newName){
      if ((oldName != null) && (newName != null) && (!oldName.isEmpty())&& (!newName.isEmpty())&& (oldName.equals(newName))) {
        return true;
      }
      return false;
    }

    boolean method2(String source,String identifer){
      if (source == null || "".equals(source)) {
        return false;
      }
      if (identifer == null || "".equals(identifer)) {
        return false;
      }
      return source.startsWith(identifer);
    }
}
