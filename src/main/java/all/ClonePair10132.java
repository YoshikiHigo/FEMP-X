package all;

public class ClonePair10132 {

    int method1(String text,String pattern){
      if (text.length() == 0 || pattern.length() == 0)   return -1;
      OUTER:   for (int i=0; i + pattern.length() <= text.length(); i++) {
        for (int j=0; j < pattern.length(); j++) {
          if (text.charAt(i + j) != pattern.charAt(j)) {
            continue OUTER;
          }
        }
        return i;
      }
      return -1;
    }

    int method2(String base,String str){
      int result=0, temp=0;
      result=temp=base.indexOf(str);
      while (temp != -1) {
        result=temp;
        temp=base.indexOf(str,result + 1);
      }
      return result;
    }
}
