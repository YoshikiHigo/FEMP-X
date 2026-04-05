package all;

public class ClonePair11006 {

    int method1(CharSequence s,CharSequence t){
      int i=0;
      while (i < s.length() && i < t.length()) {
        char a=Character.toLowerCase(s.charAt(i));
        char b=Character.toLowerCase(t.charAt(i));
        int diff=a - b;
        if (diff != 0) {
          return diff;
        }
        i++;
      }
      return s.length() - t.length();
    }

    int method2(CharSequence me,CharSequence another){
      int myLen=me.length(), anotherLen=another.length();
      int myPos=0, anotherPos=0, result;
      int end=(myLen < anotherLen) ? myLen : anotherLen;
      while (myPos < end) {
        if ((result=Character.toLowerCase(me.charAt(myPos++)) - Character.toLowerCase(another.charAt(anotherPos++))) != 0) {
          return result;
        }
      }
      return myLen - anotherLen;
    }
}
