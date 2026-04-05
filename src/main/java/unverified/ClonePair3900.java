package unverified;

public class ClonePair3900 {

    boolean method1(String fileName,String fileExtensions){
      if (fileExtensions == null || fileName == null) {
        return false;
      }
      String[] arr=fileExtensions.toUpperCase().split(" ");
      fileName=fileName.toUpperCase();
      for (  String elem : arr) {
        if (!"".equals(elem) && fileName.endsWith(elem)) {
          return true;
        }
      }
      return false;
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
