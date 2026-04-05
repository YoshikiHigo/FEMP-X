package all;

public class ClonePair12418 {

    String method1(int i){
      String str1=Integer.toString(i);
      if (i < 10 && i >= 0) {
        str1="0" + str1;
      }
      return str1;
    }

    String method2(int num){
      if (num > -1 && num < 10)   return ("0" + (new Integer(num).toString()));
     else   return (new Integer(num).toString());
    }
}
