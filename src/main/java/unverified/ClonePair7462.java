package unverified;

public class ClonePair7462 {

    String method1(char c){
    switch (c) {
    case '"':    return "&quot;";
    case '&':  return "&amp;";
    case '<':return "&lt;";
    case '>':return "&gt;";
    default:return "" + c;
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
