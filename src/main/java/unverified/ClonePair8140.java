package unverified;

public class ClonePair8140 {

    boolean method1(String chooseNewPassword,String confirmNewPassword){
      boolean state=false;
      try {
        if ((chooseNewPassword.equalsIgnoreCase("") || chooseNewPassword == null)) {
          state=false;
        }
     else {
          if (chooseNewPassword.length() >= 5) {
            if (chooseNewPassword.equalsIgnoreCase(confirmNewPassword)) {
              state=true;
            }
          }
     else {
            state=false;
          }
        }
      }
     catch (  Exception e) {
        state=false;
      }
      return state;
    }

    boolean method2(String oldName,String newName){
      if ((oldName != null) && (newName != null) && (!oldName.isEmpty())&& (!newName.isEmpty())&& (oldName.equals(newName))) {
        return true;
      }
      return false;
    }
}
