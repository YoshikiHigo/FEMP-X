package unverified;

public class ClonePair9691 {

    String method1(String str,int width,boolean rightJustified){
      int len=str.length();
      int space=width - len;
      if (space <= 0) {
        return str;
      }
      StringBuffer buf=new StringBuffer();
      if (!rightJustified) {
        buf.append(str);
      }
      for (int i=0; i < space; i++) {
        buf.append(' ');
      }
      if (rightJustified) {
        buf.append(str);
      }
      return buf.toString();
    }

    String method2(String string,int indentSize,boolean initialLine){
      String indent;
      if (indentSize == 0) {
        indent="\t";
      }
     else {
        StringBuffer s=new StringBuffer();
        for (int i=0; i < indentSize; i++) {
          s.append(' ');
        }
        indent=s.toString();
      }
      StringBuffer result=new StringBuffer();
      if (initialLine) {
        result.append(indent);
      }
      for (int i=0; i < string.length(); i++) {
        char c=string.charAt(i);
        result.append(c);
        if (c == '\n') {
          result.append(indent);
        }
      }
      return result.toString();
    }
}
