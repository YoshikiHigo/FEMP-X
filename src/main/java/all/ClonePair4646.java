package all;

public class ClonePair4646 {

    char method1(char ch){
    switch (ch) {
    case '(':    return ')';
    case ')':  return '(';
    case '[':return ']';
    case ']':return '[';
    case '{':return '}';
    case '}':return '{';
    case '\"':return '\"';
    case '\'':return '\'';
    }
    return ch;
    }

    char method2(char ch){
    switch (ch) {
    case ')':    return '(';
    case '}':  return '{';
    case ']':return '[';
    case '(':return ')';
    case '{':return '}';
    case '[':return ']';
    default:return ch;
    }
    }
}
