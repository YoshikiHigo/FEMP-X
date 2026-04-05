package unverified;

public class ClonePair3781 {

    int method1(String str,String[] strArray){
      if (str == null || strArray == null)   return -1;
      for (int i=0; i < strArray.length; i++) {
        if (str.equals(strArray[i]))     return i;
      }
      return -1;
    }

    int method2(String a,String[] array){
      if (a == null || array == null) {
        return -1;
      }
      int result=-1;
      for (int i=0; i < array.length; i++) {
        if (array[i] != null && a.equals(array[i])) {
          result=i;
          break;
        }
      }
      return result;
    }
}
