package unverified;

public class ClonePair10395 {

    int method1(String str,int startAt){
      int i;
      boolean first=true;
      for (i=startAt; i < str.length(); ++i) {
        if ((first == true) && (Character.isLetter(str.charAt(i)) == false))     break;
     else     if (Character.isLetterOrDigit(str.charAt(i)) == false)     break;
        first=false;
      }
      return i;
    }

    int method2(String version,int from){
      for (final int len=version.length(); from < len; ++from) {
        final char cc=version.charAt(from);
        if ((cc < '0' || cc > '9') && (cc < 'a' || cc > 'z') && (cc < 'A' || cc > 'Z'))     break;
      }
      return from;
    }
}
