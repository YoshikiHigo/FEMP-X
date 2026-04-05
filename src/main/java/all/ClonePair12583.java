package all;

public class ClonePair12583 {

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

    String method2(String str,int size){
      String newstr=new String(str);
      int numfill=size - str.length();
      if (numfill > 0) {
        for (int cnt=0; cnt < numfill; cnt++) {
          newstr+=" ";
        }
      }
      return newstr;
    }
}
