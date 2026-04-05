package all;

public class ClonePair8846 {

    int method1(String s,int i){
      int len=s.length();
      while (i < len && Character.isDigit(s.charAt(i))) {
        i++;
      }
      return i;
    }

    int method2(String str,int startAt){
      int i;
      for (i=startAt; i < str.length(); ++i)   if (Character.isDigit(str.charAt(i)) == false)   break;
      return i;
    }
}
