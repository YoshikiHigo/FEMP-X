package unverified;

public class ClonePair7641 {

    String method1(char c9){
    switch (c9) {
    case '<':    return "&lt;";
    case '>':  return "&gt;";
    case '&':return "&amp;";
    case '\"':return "&quot;";
    }
    return new String(new char[]{c9});
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
