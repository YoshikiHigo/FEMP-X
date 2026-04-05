package all;

public class ClonePair11067 {

    boolean method1(String[] strs,String str){
      if ((str == null) || (strs == null))   return false;
      for (int s=0; s < strs.length; s++)   if (strs[s].equalsIgnoreCase(str))   return true;
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
