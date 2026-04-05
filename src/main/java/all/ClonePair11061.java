package all;

public class ClonePair11061 {

    boolean method1(String[] list,String value){
      if (list == null || list.length == 0)   return false;
      boolean found=false;
      for (int i=0, len=list.length; i < len && !found; i++) {
        found=list[i].equals(value);
      }
      return found;
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
