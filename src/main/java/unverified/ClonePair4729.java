package unverified;

public class ClonePair4729 {

    char method1(char c){
      if (c == 'n')   return '\n';
      if (c == 'f')   return '\f';
      if (c == 'b')   return '\b';
      if (c == 't')   return '\t';
      if (c == 'r')   return '\r';
      return c;
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
