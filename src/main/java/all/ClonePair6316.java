package all;

public class ClonePair6316 {

    boolean method1(String s,String prefix){
      final int pl=prefix.length();
      if (s.length() < pl)   return false;
      for (int i=0; i < pl; i++) {
        char sc=s.charAt(i);
        char pc=prefix.charAt(i);
        if (sc != pc) {
          sc=Character.toUpperCase(sc);
          pc=Character.toUpperCase(pc);
          if (sc != pc) {
            sc=Character.toLowerCase(sc);
            pc=Character.toLowerCase(pc);
            if (sc != pc)         return false;
          }
        }
      }
      return true;
    }

    boolean method2(String target,String lastStr){
      int tarlength=target.length();
      int lastStrlength=lastStr.length();
      if (target.indexOf(lastStr) != -1) {
        int ind=target.lastIndexOf(lastStr);
        if (ind + 1 + lastStrlength >= tarlength) {
          return true;
        }
     else {
          return false;
        }
      }
     else {
        return false;
      }
    }
}
