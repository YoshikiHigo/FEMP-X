package all;

public class ClonePair6662 {

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

    boolean method2(String chooseNewPassword,String confirmNewPassword){
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
}
