package all;

public class ClonePair11050 {

    boolean method1(String[] interfaces,String intf){
      if (interfaces == null || interfaces.length <= 0) {
        return false;
      }
      for (int i=0; i < interfaces.length; i++) {
        if (interfaces[i].equals(intf)) {
          return true;
        }
      }
      return false;
    }

    boolean method2(String[] array,String text){
      if (array == null || array.length == 0)   return false;
      int arrayCount=array.length;
      int arrayIndex;
      for (arrayIndex=0; arrayIndex < arrayCount; arrayIndex++) {
        if (array[arrayIndex].equals(text))     return true;
      }
      return false;
    }
}
