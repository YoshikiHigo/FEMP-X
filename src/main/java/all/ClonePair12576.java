package all;

public class ClonePair12576 {

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

    String method2(String value,int width){
      String result=value;
      if (value.length() < width) {
        StringBuffer sb=new StringBuffer();
        for (int idx=value.length() - 1; idx >= 0; idx--) {
          sb.append(value.charAt(idx));
        }
        for (int idx=0; idx < width - value.length(); idx++) {
          sb.append(' ');
        }
        sb=sb.reverse();
        result=sb.toString();
      }
      return result;
    }
}
