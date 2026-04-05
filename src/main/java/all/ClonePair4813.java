package all;

public class ClonePair4813 {

    char method1(char ch){
    switch (ch) {
    case 'b':    ch='\b';
      break;
    case 't':ch='\t';
    break;
    case 'n':ch='\n';
    break;
    case 'f':ch='\f';
    break;
    case 'r':ch='\r';
    break;
    case '"':case '\'':case '\\':break;
    }
    return ch;
    }

    char method2(char ch){
      char escaped=ch;
      if (ch == '"') {
      }
     else   if (ch == '\\') {
      }
     else   if (ch == '/') {
      }
     else   if (ch == 'b') {
        escaped='\b';
      }
     else   if (ch == 'f') {
        escaped='\f';
      }
     else   if (ch == 'n') {
        escaped='\n';
      }
     else   if (ch == 'r') {
        escaped='\r';
      }
     else   if (ch == 't') {
        escaped='\t';
      }
      return escaped;
    }
}
