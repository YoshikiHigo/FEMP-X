package all;

public class ClonePair12585 {

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

    String method2(String f1,int f1size){
      int pad=f1size - f1.length();
      if (pad < 0)   pad=0;
      String result="";
      for (int i=0; i < pad; i++)   result+=" ";
      return (f1 + result);
    }
}
