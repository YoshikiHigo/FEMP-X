package all;

public class ClonePair12563 {

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

    String method2(String s,int length){
      char[] cs=s.toCharArray();
      int count=0;
      for (int i=0; i < cs.length; i++) {
        char c=cs[i];
        if (c <= 127)     count++;
     else     count+=2;
      }
      int sp=length - count;
      if (sp > 0) {
        char[] spaces=new char[sp];
        for (int i=0; i < spaces.length; i++)     spaces[i]=' ';
        return s + new String(spaces);
      }
      return s;
    }
}
