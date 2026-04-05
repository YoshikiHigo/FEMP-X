package all;

public class ClonePair6663 {

    boolean method1(String value1,String value2){
      try {
        if (value1 == null || value2 == null) {
          return false;
        }
     else     if (value1.trim().length() == 0 || value2.trim().length() == 0) {
          return false;
        }
     else {
          return value1.equals(value2);
        }
      }
     catch (  Exception e) {
        return false;
      }
    }

    boolean method2(String oldName,String newName){
      if ((oldName != null) && (newName != null) && (!oldName.isEmpty())&& (!newName.isEmpty())&& (oldName.equals(newName))) {
        return true;
      }
      return false;
    }
}
