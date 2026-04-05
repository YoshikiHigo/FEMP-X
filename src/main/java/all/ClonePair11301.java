package all;

public class ClonePair11301 {

    String method1(String s,int places){
      int j=places - s.length();
      if (j > 0) {
        StringBuffer sb=null;
        sb=new StringBuffer(j);
        for (int k=0; k < j; k++) {
          sb.append(' ');
        }
        return sb.toString() + s;
      }
     else {
        return s;
      }
    }

    String method2(String a_string,int a_normLength){
      if (a_string.length() < a_normLength) {
        char[] space=new char[a_normLength - a_string.length()];
        for (int i=0; i < space.length; i++) {
          space[i]=' ';
        }
        a_string=a_string + new String(space);
      }
      return a_string;
    }
}
