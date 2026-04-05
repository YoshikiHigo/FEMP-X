package all;

public class ClonePair12560 {

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

    String method2(String value,int len){
      int icnt=len - value.length();
      if (icnt <= 0)   return value;
      StringBuilder strRet=new StringBuilder(value);
      for (int i=0; i < icnt; i++) {
        strRet.insert(0,'0');
      }
      return strRet.toString();
    }
}
