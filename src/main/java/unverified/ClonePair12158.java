package unverified;

public class ClonePair12158 {

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

    boolean method2(String palavra){
      if (!(palavra.length() == 16)) {
        return false;
      }
      String dia=palavra.substring(0,2);
      String mes=palavra.substring(3,5);
      String ano=palavra.substring(6,10);
      String hora=palavra.substring(11,13);
      String minuto=palavra.substring(14,palavra.length());
      if (!(palavra.substring(2,3).equals("/")) || !(palavra.substring(5,6).equals("/")) || !(palavra.substring(10,11).equals(" "))|| !(palavra.substring(13,14).equals(":"))) {
        return false;
      }
      for (int i=0; i < dia.length(); i++) {
        if (!Character.isDigit(dia.charAt(i))) {
          return false;
        }
      }
      if (Integer.parseInt(dia) > 31 || Integer.parseInt(dia) < 1) {
        System.out.println("Dia invalido");
        return false;
      }
      for (int i=0; i < mes.length(); i++) {
        if (!Character.isDigit(mes.charAt(i))) {
          return false;
        }
      }
      if (Integer.parseInt(mes) > 12 || Integer.parseInt(mes) < 1) {
        System.out.println("Mes invalido");
        return false;
      }
      for (int i=0; i < ano.length(); i++) {
        if (!Character.isDigit(ano.charAt(i))) {
          return false;
        }
      }
      for (int i=0; i < hora.length(); i++) {
        if (!Character.isDigit(hora.charAt(i))) {
          return false;
        }
      }
      if (Integer.parseInt(hora) > 23 || Integer.parseInt(hora) < 00) {
        System.out.println("Hora invalida");
        return false;
      }
      for (int i=0; i < minuto.length(); i++) {
        if (!Character.isDigit(minuto.charAt(i))) {
          return false;
        }
      }
      if (Integer.parseInt(minuto) > 59 || Integer.parseInt(minuto) < 00) {
        System.out.println("Minutos invalidos");
        return false;
      }
      return true;
    }
}
