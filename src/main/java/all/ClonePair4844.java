package all;

public class ClonePair4844 {

    char method1(char ch){
      if (ch >= 'A' && ch <= 'Z')   return (char)(ch | 0x20);
      return ch;
    }

    char method2(char c){
      if (c >= 'A' && c <= 'Z')   return (char)(c - 'A' + 'a');
     else   return c;
    }
}
