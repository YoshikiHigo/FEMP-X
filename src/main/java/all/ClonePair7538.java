package all;

public class ClonePair7538 {

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
