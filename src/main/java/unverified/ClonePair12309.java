package unverified;

public class ClonePair12309 {

    boolean method1(String text){
      char ch;
      text=text.toUpperCase();
      boolean retVal=true;
      for (int i=0; i < text.length(); i++) {
        ch=text.charAt(i);
        if (!((ch >= 'A' && ch <= 'Z') || (ch == ' ' || ch == '.' || ch == ',')))     retVal=false;
      }
      return retVal;
    }

    boolean method2(String key){
      char[] temp=key.toCharArray();
      int len=temp.length;
      for (int i=0; i < len; i++) {
        char current=temp[i];
        if (current >= 'A' && current <= 'Z') {
          continue;
        }
        if (current >= 'a' && current <= 'z') {
          continue;
        }
        if (current >= '0' && current <= '9') {
          continue;
        }
        if (i > 0 && (current == '-' || current == '_')) {
          continue;
        }
        if (i > 0 && (current == '(' || current == ')')) {
          continue;
        }
        return false;
      }
      return true;
    }
}
