package all;

public class ClonePair12352 {

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

    boolean method2(String xmlName){
      boolean isValidXMLName=true;
      for (int c=0; c < xmlName.length() && isValidXMLName; c++) {
        char ch=xmlName.charAt(c);
        isValidXMLName=Character.isLetter(ch) || ch == '_' || ch == ':';
        if (c > 0) {
          isValidXMLName=isValidXMLName || Character.isDigit(ch) || ch == '-' || ch == '.';
        }
      }
      return isValidXMLName;
    }
}
