package all;

public class ClonePair4075 {

    boolean method1(String[] left,String[] right){
      boolean result=left.length == right.length;
      if (result) {
        for (int i=0; i < left.length; i++) {
          result&=((left[i] == null && right[i] == null) || left[i] != null && left[i].equals(right[i]));
          if (!result) {
            break;
          }
        }
      }
      return result;
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
