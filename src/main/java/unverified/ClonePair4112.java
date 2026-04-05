package unverified;

public class ClonePair4112 {

    boolean method1(String[] termos1,String[] termos2){
      if (termos1.length != termos2.length) {
        return false;
      }
      for (int i=0; i < termos1.length; i++) {
        if (!termos1[i].equals(termos2[i])) {
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
