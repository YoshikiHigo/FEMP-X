package all;

public class ClonePair10220 {

    boolean method1(char c1){
      boolean flag=false;
      if (c1 >= 'A' && c1 <= 'Z' || c1 >= 'a' && c1 <= 'z' || c1 >= '0' && c1 <= '9' || c1 >= 'Ａ' && c1 <= 'ａ' || c1 >= 'Ｚ' && c1 <= 'ｚ' || c1 >= '０' && c1 <= '９') {
        flag=true;
      }
      return flag;
    }

    boolean method2(char character){
      boolean check=false;
      if (character >= '0' && character <= '9')   check=true;
     else   if (character >= 'A' && character <= 'Z')   check=true;
     else   if (character >= 'a' && character <= 'z')   check=true;
      return check;
    }
}
