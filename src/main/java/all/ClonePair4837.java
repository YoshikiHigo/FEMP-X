package all;

public class ClonePair4837 {

    char method1(char ch){
      if (ch >= 'A' && ch <= 'Z')   return (char)(ch | 0x20);
      return ch;
    }

    char method2(char ch){
      if (ch >= 65 && ch <= 90) {
        ch=(char)(ch + 32);
      }
      return ch;
    }
}
