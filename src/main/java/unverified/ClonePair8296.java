package unverified;

public class ClonePair8296 {

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
      StringBuffer sb=null;
      int i=0;
      while (i < s1.length() && i < s2.length() && s1.charAt(i) == s2.charAt(i)) {
        if (sb == null) {
          sb=new StringBuffer(Math.min(s1.length(),s2.length()));
        }
        sb.append(s1.charAt(i));
        i++;
      }
      return (sb != null ? sb.toString() : "");
    }
}
