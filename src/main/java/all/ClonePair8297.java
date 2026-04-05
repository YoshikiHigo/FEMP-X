package all;

public class ClonePair8297 {

    String method1(String string1,String string2){
      StringBuilder match=new StringBuilder();
      for (int i=0; i < string1.length(); i++) {
        if (string1.length() > i && string2.length() > i) {
          if (string1.charAt(i) == string2.charAt(i)) {
            match.append(string1.charAt(i));
          }
     else {
            break;
          }
        }
      }
      return match.toString();
    }

    String method2(String s1,String s2){
      int i;
      for (i=0; i < s1.length() && i < s2.length(); i++)   if (s1.charAt(i) != s2.charAt(i))   break;
      return s1.substring(0,i);
    }
}
