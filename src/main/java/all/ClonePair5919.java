package all;

public class ClonePair5919 {

    boolean method1(String a,String b){
      for (int i=0; i < a.length(); i++) {
        if ((a.charAt(i) != 'X') & (a.charAt(i) != b.charAt(i)))     return false;
      }
      return true;
    }

    boolean method2(String o,String e){
      for (int i=0; i < o.length(); i++)   if ((o.charAt(i) != e.charAt(i)) && (e.charAt(i) != 'X'))   return false;
      return true;
    }
}
