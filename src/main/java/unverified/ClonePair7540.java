package unverified;

public class ClonePair7540 {

    String method1(char ch){
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

    String method2(char c){
    switch (c) {
    case '&':    return "&amp;";
    case '>':  return "&gt;";
    case '<':return "&lt;";
    case '"':return "&quot;";
    default:return String.valueOf(c);
    }
    }
}
