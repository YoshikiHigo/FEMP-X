package all;

public class ClonePair5444 {

    boolean method1(String oldString,String newString){
      if (oldString == null && newString == null) {
        return false;
      }
     else   if ((oldString == null && newString != null) || (oldString != null && newString == null)) {
        return true;
      }
     else {
        return !oldString.equals(newString);
      }
    }

    boolean method2(String str1,String str2){
      if ((str1 == null) && (str2 == null))   return false;
      if (str1 == null)   return true;
      if (str2 == null)   return true;
      return !str1.equals(str2);
    }
}
