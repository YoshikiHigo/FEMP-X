package all;

public class ClonePair4000 {

    boolean method1(String action,String name,String description,String user){
      boolean isNull;
      if ((action == null || action.trim().isEmpty()) || (name == null || name.trim().isEmpty()) || (description == null || description.trim().isEmpty())|| (user == null || user.trim().isEmpty())) {
        isNull=true;
      }
     else {
        isNull=false;
      }
      return isNull;
    }

    boolean method2(String string1,String string2,String string3,String string4){
      if (string1 == null || string1.trim().equals(""))   return true;
      if (string2 == null || string2.trim().equals(""))   return true;
      if (string3 == null || string3.trim().equals(""))   return true;
      if (string4 == null || string4.trim().equals(""))   return true;
      return false;
    }
}
