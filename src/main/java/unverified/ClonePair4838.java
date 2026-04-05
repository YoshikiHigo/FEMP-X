package unverified;

public class ClonePair4838 {

    char method1(char ch){
      if (ch >= 'A' && ch <= 'Z')   return (char)(ch | 0x20);
      return ch;
    }

    char method2(char input){
      if (input == 12288) {
        input=(char)32;
      }
     else   if (input > 65280 && input < 65375) {
        input=(char)(input - 65248);
      }
     else   if (input >= 'A' && input <= 'Z') {
        input+=32;
      }
      return input;
    }
}
