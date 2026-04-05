package all;

public class ClonePair9712 {

    boolean method1(char[] o1,char[] o2){
      if (o1 == o2) {
        return true;
      }
      if (o1 == null || o2 == null) {
        return false;
      }
      int length=o1.length;
      if (length != o2.length)   return false;
      for (int index=0; index < length; index++) {
        if (!(o1[index] == o2[index])) {
          return false;
        }
      }
      return true;
    }

    boolean method2(char[] password1,char[] password2){
      if (password1 == null && password2 == null) {
        return true;
      }
      if (password1 == null || password2 == null) {
        return false;
      }
      if (password1.length != password2.length) {
        return false;
      }
      for (int i=0; i < password1.length; i++) {
        if (password1[i] != password2[i]) {
          return false;
        }
      }
      return true;
    }
}
