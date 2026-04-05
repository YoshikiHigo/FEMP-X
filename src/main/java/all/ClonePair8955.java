package all;

public class ClonePair8955 {

    boolean method1(String string1,String string2){
      boolean stringsAreEqual=false;
      if (string1.length() == string2.length()) {
        int stringLength=string1.length();
        int pos;
        for (pos=0; pos < stringLength; ++pos) {
          if (Character.toUpperCase(string1.charAt(pos)) != Character.toUpperCase(string2.charAt(pos))) {
            break;
          }
        }
        if (pos == stringLength) {
          stringsAreEqual=true;
        }
      }
      return stringsAreEqual;
    }

    boolean method2(String string1,String string2){
      if (string2.length() != string1.length())   return (false);
      for (int i=0; i < string2.length(); i++) {
        if (Character.toLowerCase(string1.charAt(i)) != Character.toLowerCase(string2.charAt(i)))     return (false);
      }
      return (true);
    }
}
