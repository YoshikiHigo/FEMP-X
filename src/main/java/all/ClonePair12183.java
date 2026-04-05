package all;

public class ClonePair12183 {

    boolean method1(String p_valor){
      if (p_valor.length() != 9)   return false;
      if ("ABCDEFGHKLMNPQS".indexOf(p_valor.substring(0,1)) == -1)   return false;
      for (int i=1; i < 8; i++) {
        if ("0123456789".indexOf(p_valor.substring(i,i + 1)) == -1)     return false;
      }
      if ("ABCDEFGHIJ0123456789".indexOf(p_valor.substring(8,9)) == -1)   return false;
      int[] l_nums={0,2,4,6,8,1,3,5,7,9};
      char[] l_chars={'J','A','B','C','D','E','F','G','H','I'};
      int temp=0;
      for (int i=2; i <= 6; i+=2) {
        temp=temp + l_nums[Integer.parseInt(p_valor.substring(i - 1,i))];
        temp=temp + Integer.parseInt(p_valor.substring(i,i + 1));
      }
      temp=temp + l_nums[Integer.parseInt(p_valor.substring(7,8))];
      temp=(10 - (temp % 10));
      if (temp == 10)   temp=0;
      if (p_valor.substring(8,9).equals(String.valueOf(temp)) || p_valor.substring(8,9).equalsIgnoreCase(String.valueOf(l_chars[temp])))   return true;
      return false;
    }

    boolean method2(String CNPJOriginal){
      String cnpj=CNPJOriginal.replaceAll("[^0-9]*","");
      int primeiroDigito=0;
      int segundoDigito=0;
      int resto=0;
      int constante;
      int soma;
      boolean isValido=true;
      if (cnpj.length() != 14)   return false;
      constante=6;
      soma=0;
      for (int i=0; i < (cnpj.length() - 1); i++) {
        soma+=(Integer.parseInt(String.valueOf(cnpj.charAt(i))) * constante);
        if (constante == 2)     constante=9;
     else     constante--;
      }
      resto=soma % 11;
      if (resto < 2)   primeiroDigito=0;
     else   primeiroDigito=11 - resto;
      constante=5;
      soma=0;
      for (int i=0; i < (cnpj.length() - 2); i++) {
        soma+=(Integer.parseInt(String.valueOf(cnpj.charAt(i))) * constante);
        if (constante == 2)     constante=9;
     else     constante--;
      }
      resto=soma % 11;
      if (resto < 2)   segundoDigito=0;
     else   segundoDigito=11 - resto;
      if (primeiroDigito != Integer.parseInt(String.valueOf(cnpj.charAt(12))))   isValido=false;
     else   if (segundoDigito != Integer.parseInt(String.valueOf(cnpj.charAt(13))))   isValido=false;
      return isValido;
    }
}
