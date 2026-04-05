package all;

public class ClonePair6674 {

    boolean method1(String name,String firstName){
      if ((name == null) || (firstName == null)) {
        return false;
      }
      if (name.trim().equals("") && firstName.trim().equals("")) {
        return false;
      }
      return true;
    }

    boolean method2(String name,String firstName){
      if (name == null || firstName == null) {
        return false;
      }
      if (name.trim().equals("") && firstName.trim().equals("")) {
        return false;
      }
      return true;
    }
}
