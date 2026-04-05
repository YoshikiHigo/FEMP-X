package unverified;

public class ClonePair9574 {

    boolean method1(char[] ch1,char[] ch2){
      if (ch1 == null) {
        if (ch2 == null) {
          return true;
        }
     else {
          return false;
        }
      }
     else   if (ch2 == null) {
        return false;
      }
      if (ch1.length != ch2.length)   return false;
      for (int i=0; i < ch1.length; i++) {
        if (ch1[i] != ch2[i])     return false;
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
