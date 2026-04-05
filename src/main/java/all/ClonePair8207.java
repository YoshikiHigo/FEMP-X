package all;

public class ClonePair8207 {

    boolean method1(Object pObject){
      if (pObject instanceof String) {
        String str=(String)pObject;
        int len=str.length();
        for (int i=0; i < len; i++) {
          char ch=str.charAt(i);
          if (ch == '.' || ch == 'e' || ch == 'E') {
            return true;
          }
        }
        return false;
      }
     else {
        return false;
      }
    }

    boolean method2(Object o){
      if (o instanceof String) {
        String s=(String)o;
        return s.indexOf(',') >= 0 || s.indexOf('e') >= 0 || s.indexOf('E') >= 0;
      }
     else   return false;
    }
}
