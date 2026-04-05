package unverified;

public class ClonePair12367 {

    String method1(String string,String placeholder,String replacement){
      if (string == null) {
        return string;
      }
      int loc=string.indexOf(placeholder);
      if (loc < 0) {
        return string;
      }
     else {
        return new StringBuilder(string.substring(0,loc)).append(replacement).append(string.substring(loc + placeholder.length())).toString();
      }
    }

    String method2(String value,String oldKeySubstring,String newKeySubstring){
      if (value == null) {
        return null;
      }
      int oldKeySubstringSize=oldKeySubstring.length();
      while (true) {
        int index=value.indexOf(oldKeySubstring);
        if (index == -1) {
          break;
        }
        value=value.substring(0,index) + newKeySubstring + value.substring(index + oldKeySubstringSize);
      }
      return value;
    }
}
