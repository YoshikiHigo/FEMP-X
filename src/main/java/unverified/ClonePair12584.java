package unverified;

public class ClonePair12584 {

    String method1(String a_string,int a_normLength){
      if (a_string.length() < a_normLength) {
        char[] space=new char[a_normLength - a_string.length()];
        for (int i=0; i < space.length; i++) {
          space[i]=' ';
        }
        a_string=a_string + new String(space);
      }
      return a_string;
    }

    String method2(String s,int to){
      if (s.length() < to) {
        StringBuffer buf=new StringBuffer(s);
        for (int i=0; i < to - s.length(); i++) {
          buf.append(' ');
        }
        return buf.toString();
      }
     else {
        return s;
      }
    }
}
