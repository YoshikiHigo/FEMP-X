package all;

public class ClonePair4007 {

    boolean method1(String s,String text,String delimiter){
      if ((s == null) || (text == null) || (delimiter == null))   return false;
      if (!s.endsWith(delimiter))   s+=delimiter;
      int pos=s.indexOf(delimiter + text + delimiter);
      if (pos == -1) {
        if (s.startsWith(text + delimiter))     return true;
     else     return false;
      }
     else   return true;
    }

    boolean method2(String s,String text,String delimiter){
      if ((s == null) || (text == null) || (delimiter == null)) {
        return false;
      }
      if (!s.endsWith(delimiter)) {
        s+=delimiter;
      }
      int pos=s.indexOf(delimiter + text + delimiter);
      if (pos == -1) {
        if (s.startsWith(text + delimiter)) {
          return true;
        }
        return false;
      }
      return true;
    }
}
