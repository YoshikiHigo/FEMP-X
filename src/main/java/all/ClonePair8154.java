package all;

public class ClonePair8154 {

    boolean method1(String oldName,String newName){
      if ((oldName != null) && (newName != null) && (!oldName.isEmpty())&& (!newName.isEmpty())&& (oldName.equals(newName))) {
        return true;
      }
      return false;
    }

    boolean method2(String p1,String p2){
      if (p1 != null && p1.length() == 0)   p1=null;
      if (p2 != null && p2.length() == 0)   p2=null;
      return (p1 != null && p2 != null && p1.equals(p2));
    }
}
