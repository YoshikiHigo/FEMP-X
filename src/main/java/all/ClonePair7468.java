package all;

public class ClonePair7468 {

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
    switch (c) {
    case '&':    return "&amp;";
    case '>':  return "&gt;";
    case '<':return "&lt;";
    case '"':return "&quot;";
    default:return String.valueOf(c);
    }
    }
}
