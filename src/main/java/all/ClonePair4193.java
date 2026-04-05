package all;

public class ClonePair4193 {

    boolean method1(String one,String two){
      int index1=one.indexOf("[");
      int index2=two.indexOf("[");
      if (index1 > 0) {
        one=one.substring(0,index1);
      }
      if (index2 > 0) {
        two=two.substring(0,index2);
      }
      return one.equals(two);
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
