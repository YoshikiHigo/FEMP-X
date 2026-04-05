package all;

public class ClonePair11036 {

    boolean method1(String[] strs,String str){
      if ((str == null) || (strs == null))   return false;
      for (int s=0; s < strs.length; s++)   if (strs[s].equals(str))   return true;
      return false;
    }

    boolean method2(String[] array,String string){
      for (int i=0; array != null && string != null && i < array.length; i++) {
        if (array[i].equals(string)) {
          return true;
        }
      }
      return false;
    }
}
