package all;

public class ClonePair9038 {

    boolean method1(String string,String test){
      if (test.length() > string.length())   return (false);
      if (test.equals("") && !string.equals(""))   return (false);
      for (int i=0; i < test.length(); i++) {
        if (Character.toLowerCase(string.charAt(i)) != Character.toLowerCase(test.charAt(i)))     return (false);
      }
      return (true);
    }

    boolean method2(String arg1,String arg2){
      if (arg1.length() > arg2.length())   return false;
      boolean returnArg=true;
      int i=0;
      int length=arg1.length();
      while (i < length) {
        char x=arg1.charAt(i);
        char y=arg2.charAt(i);
        if (x != y) {
          returnArg=false;
          break;
        }
        i+=1;
      }
      if (arg2.length() > length) {
        if (arg2.charAt(i) != '.')     returnArg=false;
      }
      return returnArg;
    }
}
