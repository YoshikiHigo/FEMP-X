package unverified;

public class ClonePair4068 {

    boolean method1(String[] a1,String[] a2){
      if (a1.length != a2.length)   return false;
      for (int i=0; i < a1.length; i++) {
        if (!a1[i].equals(a2[i])) {
          return false;
        }
      }
      return true;
    }

    boolean method2(String[] a1,String[] a2){
      if (a1.length != a2.length)   return (false);
      for (int i=0; i < a1.length; i++) {
        if (!a1[i].equals(a2[i]))     return (false);
      }
      return (true);
    }
}
