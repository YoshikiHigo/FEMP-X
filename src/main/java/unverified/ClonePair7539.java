package unverified;

public class ClonePair7539 {

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

    String method2(char c9){
    switch (c9) {
    case '<':    return "&lt;";
    case '>':  return "&gt;";
    case '&':return "&amp;";
    case '\"':return "&quot;";
    }
    return new String(new char[]{c9});
    }
}
