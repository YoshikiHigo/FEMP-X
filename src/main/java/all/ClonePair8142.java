package all;

public class ClonePair8142 {

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

    boolean method2(String A,String B){
      try {
        final char[] a=A.toCharArray();
        final char[] b=B.toCharArray();
        if (a.length != b.length) {
          return false;
        }
        for (int i=0; i < a.length; i++) {
          if (a[i] != b[i]) {
            return false;
          }
        }
        return true;
      }
     catch (  Exception e) {
        return false;
      }
    }
}
