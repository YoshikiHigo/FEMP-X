package unverified;

public class ClonePair4063 {

    boolean method1(String[] a1,String[] a2){
      if (a1.length != a2.length)   return false;
      for (int i=0; i < a1.length; i++) {
        if (!a1[i].equals(a2[i])) {
          return false;
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
