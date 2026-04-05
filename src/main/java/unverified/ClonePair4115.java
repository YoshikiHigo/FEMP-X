package unverified;

public class ClonePair4115 {

    boolean method1(String[] strings1,String[] strings2){
      if (strings1.length != strings2.length)   return false;
      for (int i=0; i < strings1.length; ++i)   if (!strings1[i].equals(strings2[i]))   return false;
      return true;
    }

    boolean method2(String[] s1,String[] s2){
      boolean equal=true;
      int index=0;
      if (s1.length == s2.length) {
        while ((index < s1.length) && (equal)) {
          if (s1[index].equals(s2[index])) {
            index++;
          }
     else {
            equal=false;
          }
        }
        if (index == s1.length)     return true;
     else     return false;
      }
     else {
        return false;
      }
    }
}
