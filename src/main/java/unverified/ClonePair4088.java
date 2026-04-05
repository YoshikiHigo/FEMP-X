package unverified;

public class ClonePair4088 {

    boolean method1(String[] s1,String[] s2){
      if (s1.length != s2.length) {
        return false;
      }
     else {
        for (int i=0; i < s1.length; i++) {
          if (!(s1[i].equalsIgnoreCase(s2[i]))) {
            return false;
          }
        }
      }
      return true;
    }

    boolean method2(String[] strings1,String[] strings2){
      if (strings1.length != strings2.length)   return false;
      for (int i=0; i < strings1.length; ++i)   if (!strings1[i].equals(strings2[i]))   return false;
      return true;
    }
}
