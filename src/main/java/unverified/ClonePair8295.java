package unverified;

public class ClonePair8295 {

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

    String method2(String str1,String str2){
      int min=Math.min(str1.length(),str2.length());
      for (int i=0; i < min; i++) {
        if (str1.charAt(i) != str2.charAt(i)) {
          return str1.substring(0,i);
        }
      }
      return (str1.length() < str2.length()) ? str1 : str2;
    }
}
