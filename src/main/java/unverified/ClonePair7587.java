package unverified;

public class ClonePair7587 {

    String method1(char c){
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
