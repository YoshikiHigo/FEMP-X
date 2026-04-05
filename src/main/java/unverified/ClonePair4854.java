package unverified;

public class ClonePair4854 {

    char method1(char ch){
      if (ch >= 65 && ch <= 90) {
        ch=(char)(ch + 32);
      }
      return ch;
    }

    char method2(char c){
      if (c >= 'A' && c <= 'Z')   return (char)(c - 'A' + 'a');
     else   return c;
    }
}
