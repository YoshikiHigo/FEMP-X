package unverified;

public class ClonePair11055 {

    boolean method1(String[] items,String newText){
      if (items == null || items.length == 0)   return false;
      for (  String s : items)   if (s.equalsIgnoreCase(newText))   return true;
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
