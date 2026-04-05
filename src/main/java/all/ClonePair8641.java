package all;

public class ClonePair8641 {

    boolean method1(char x){
      if (x == '.')   return (true);
      if (x == '+')   return (true);
      if (x == '-')   return (true);
      if ((x >= '0') && (x <= '9'))   return (true);
      return (false);
    }

    boolean method2(char ch){
      if ('0' <= ch && ch <= '9')   return true;
      if (ch == '+' || ch == '-' || ch == '.')   return true;
      return false;
    }
}
