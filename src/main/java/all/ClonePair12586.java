package all;

public class ClonePair12586 {

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

    String method2(String s,int w){
      if (s.length() < w) {
        int d=w - s.length();
        StringBuilder b=new StringBuilder();
        for (int i=0; i < d; ++i)     b.append(' ');
        return s + b.toString();
      }
     else {
        return s;
      }
    }
}
