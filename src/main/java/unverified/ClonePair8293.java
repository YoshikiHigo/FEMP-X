package unverified;

public class ClonePair8293 {

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

    String method2(String string1,String string2){
      int length1=string1.length();
      int length2=string2.length();
      String shorter, longer;
      int length;
      if (length1 < length2) {
        shorter=string1;
        longer=string2;
        length=length1;
      }
     else {
        shorter=string2;
        longer=string1;
        length=length2;
      }
      for (int i=0; i < length; i++) {
        if (shorter.charAt(i) != longer.charAt(i)) {
          return shorter.substring(0,i);
        }
      }
      return shorter;
    }
}
