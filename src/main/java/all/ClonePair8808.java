package all;

public class ClonePair8808 {

    boolean method1(char x){
    switch (x) {
    case '0':case '1':case '2':case '3':case '4':case '5':case '6':case '7':case '8':case '9':case '.':case '-':case '+':case 'e':case 'E':    return (true);
    default:  return (false);
    }
    }

    boolean method2(char c){
      if (Character.isDigit(c)) {
        return true;
      }
      return (c == '.' || c == '+' || c == '-' || c == 'e' || c == 'E');
    }
}
