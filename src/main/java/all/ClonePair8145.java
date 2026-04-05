package all;

public class ClonePair8145 {

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

    boolean method2(String p1,String p2){
      if (p1 != null && p1.length() == 0)   p1=null;
      if (p2 != null && p2.length() == 0)   p2=null;
      return (p1 != null && p2 != null && p1.equals(p2));
    }
}
