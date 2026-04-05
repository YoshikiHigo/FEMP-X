package all;

public class ClonePair9624 {

    boolean method1(char[] b1,char[] b2){
      if (b1 == null) {
        return (b2 == null);
      }
     else   if (b2 == null) {
        return false;
      }
     else   if (b1 == b2) {
        return true;
      }
     else   if (b1.length != b2.length) {
        return false;
      }
      for (int i=0; i < b1.length; i++) {
        if (b1[i] != b2[i]) {
          return false;
        }
      }
      return true;
    }

    boolean method2(char[] o1,char[] o2){
      if (o1 == o2)   return true;
      if (o1 == null || o2 == null)   return false;
      int length=o1.length;
      if (length != o2.length)   return false;
      for (int index=0; index < length; index++) {
        if (!(o1[index] == o2[index]))     return false;
      }
      return true;
    }
}
