package unverified;

public class ClonePair8535 {

    boolean method1(StringBuffer buf,String s){
      int iBuf=buf.length();
      int iS=s.length();
      while (--iS >= 0 && --iBuf >= 0 && buf.charAt(iBuf) == s.charAt(iS)) {
      }
      return iS < 0;
    }

    boolean method2(StringBuffer line,String string){
      if (line.length() < string.length()) {
        return false;
      }
      for (int i=0; i < string.length(); i++) {
        if (line.charAt(i) != string.charAt(i)) {
          return false;
        }
      }
      return true;
    }
}
