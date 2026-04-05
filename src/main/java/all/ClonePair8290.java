package all;

public class ClonePair8290 {

    boolean method1(String a,String b){
      if (a == b)   return true;
      String aw=a.split(" ",1)[0];
      String bw=b.split(" ",1)[0];
      return aw.compareTo(bw) == 0;
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
