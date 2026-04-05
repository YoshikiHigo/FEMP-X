package all;

public class ClonePair9583 {

    boolean method1(char c){
      if ((c >= 65 && c < 91) || (c >= 97 && c < 123)) {
        return true;
      }
     else   if (c >= 48 && c <= 57) {
        return true;
      }
     else {
        return false;
      }
    }

    boolean method2(char c1){
      boolean flag=false;
      if (c1 >= 'A' && c1 <= 'Z' || c1 >= 'a' && c1 <= 'z' || c1 >= '0' && c1 <= '9' || c1 >= 'Ａ' && c1 <= 'ａ' || c1 >= 'Ｚ' && c1 <= 'ｚ' || c1 >= '０' && c1 <= '９') {
        flag=true;
      }
      return flag;
    }
}
