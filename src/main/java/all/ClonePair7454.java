package all;

public class ClonePair7454 {

    String method1(char c){
    switch (c) {
    case '"':    return "&quot;";
    case '&':  return "&amp;";
    case '<':return "&lt;";
    case '>':return "&gt;";
    default:return "" + c;
    }
    }

    String method2(char ch){
      if (ch == '<') {
        return "&lt;";
      }
     else   if (ch == '>') {
        return "&gt;";
      }
     else   if (ch == '&') {
        return "&amp;";
      }
     else   if (ch == '"') {
        return "&quot;";
      }
     else {
        return ((new Character(ch)).toString());
      }
    }
}
