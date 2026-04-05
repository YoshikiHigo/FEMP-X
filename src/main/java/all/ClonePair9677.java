package all;

public class ClonePair9677 {

    boolean method1(char[] secret1,char[] secret2){
      boolean result=false;
      if ((secret1 == null) || (secret2 == null)) {
        result=(secret1 == secret2);
      }
     else {
        if (secret1.length == secret2.length) {
          boolean equals=true;
          for (int i=0; (i < secret1.length) && equals; i++) {
            equals=(secret1[i] == secret2[i]);
          }
          result=equals;
        }
      }
      return result;
    }

    boolean method2(char[] arr1,char[] arr2){
      if (arr1 == arr2)   return true;
      if (arr1 != null && arr2 != null && arr1.length == arr2.length) {
        for (int i=arr1.length; i-- > 0; )     if (arr1[i] != arr2[i])     return false;
        return true;
      }
      return false;
    }
}
