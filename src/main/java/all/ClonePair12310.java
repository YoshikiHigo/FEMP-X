package all;

public class ClonePair12310 {

    boolean method1(String text){
      char ch;
      text=text.toUpperCase();
      boolean retVal=true;
      for (int i=0; i < text.length(); i++) {
        ch=text.charAt(i);
        if (!((ch >= 'A' && ch <= 'Z') || (ch == ' ' || ch == '.' || ch == ',')))     retVal=false;
      }
      return retVal;
    }

    boolean method2(String username){
      for (int i=0; i < username.length(); i++) {
        final int tempChar=(int)username.charAt(i);
        if (!(tempChar >= 65 && tempChar <= 90) && !(tempChar >= 97 && tempChar <= 122) && !(tempChar >= 48 && tempChar <= 57)&& !(tempChar == 45)&& !(tempChar == 95)) {
          return false;
        }
      }
      return true;
    }
}
