package unverified;

public class ClonePair7456 {

    String method1(char c){
    switch (c) {
    case '"':    return "&quot;";
    case '&':  return "&amp;";
    case '<':return "&lt;";
    case '>':return "&gt;";
    default:return "" + c;
    }
    }

    String method2(char c){
      if (c == '<') {
        return "&lt;";
      }
     else   if (c == '>') {
        return "&gt;";
      }
     else   if (c == '&') {
        return "&amp;";
      }
     else   if (c == '"') {
        return "&quot;";
      }
     else {
        return String.valueOf(c);
      }
    }
}
