package all;

public class ClonePair10248 {

    boolean method1(char c1){
      boolean flag=false;
      if (c1 >= 'A' && c1 <= 'Z' || c1 >= 'a' && c1 <= 'z' || c1 >= '0' && c1 <= '9' || c1 >= 'Ａ' && c1 <= 'ａ' || c1 >= 'Ｚ' && c1 <= 'ｚ' || c1 >= '０' && c1 <= '９') {
        flag=true;
      }
      return flag;
    }

    boolean method2(char b){
      if ((b >= 'a') && (b <= 'z'))   return true;
      if ((b >= 'A') && (b <= 'Z'))   return true;
      if ((b >= '0') && (b <= '9'))   return true;
      return false;
    }
}
