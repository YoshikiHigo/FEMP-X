package all;

public class ClonePair10194 {

    boolean method1(char c1){
      boolean flag=false;
      if (c1 >= 'A' && c1 <= 'Z' || c1 >= 'a' && c1 <= 'z' || c1 >= '0' && c1 <= '9' || c1 >= 'Ａ' && c1 <= 'ａ' || c1 >= 'Ｚ' && c1 <= 'ｚ' || c1 >= '０' && c1 <= '９') {
        flag=true;
      }
      return flag;
    }

    boolean method2(char ch){
      if (ch <= 'z' && 'a' <= ch) {
        return true;
      }
     else   if (ch <= 'Z' && 'A' <= ch) {
        return true;
      }
      return ch <= '9' && '0' <= ch;
    }
}
