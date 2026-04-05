package unverified;

public class ClonePair4098 {

    boolean method1(String[] test1,String[] test2){
      boolean isEqual=true;
      if (test1.length != test2.length) {
        isEqual=false;
      }
     else {
        for (int i=0; i < test1.length; i++) {
          if (test1[i] != null) {
            if (!test1[i].equals(test2[i])) {
              isEqual=false;
              break;
            }
          }
     else {
            if (test2[i] != null) {
              isEqual=false;
              break;
            }
          }
        }
      }
      return isEqual;
    }

    boolean method2(String[] strings1,String[] strings2){
      if (strings1.length != strings2.length) {
        return false;
      }
      for (int i=0; i < strings2.length; i++) {
        if (strings1[i] == null) {
          if (strings2[i] == null) {
            continue;
          }
     else {
            return false;
          }
        }
     else     if (!strings1[i].equals(strings2[i])) {
          return false;
        }
      }
      return true;
    }
}
