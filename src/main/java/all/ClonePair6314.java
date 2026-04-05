package all;

public class ClonePair6314 {

    boolean method1(String s,String prefix){
      final int pl=prefix.length();
      if (s.length() < pl)   return false;
      for (int i=0; i < pl; i++) {
        char sc=s.charAt(i);
        char pc=prefix.charAt(i);
        if (sc != pc) {
          sc=Character.toUpperCase(sc);
          pc=Character.toUpperCase(pc);
          if (sc != pc) {
            sc=Character.toLowerCase(sc);
            pc=Character.toLowerCase(pc);
            if (sc != pc)         return false;
          }
        }
      }
      return true;
    }

    boolean method2(String dominio1,String dominio2){
      int num1=dominio1.indexOf("@");
      int num2=dominio2.indexOf("@");
      dominio1=dominio1.trim();
      dominio2=dominio2.trim();
      if ((dominio1.indexOf("@") != -1 && dominio2.indexOf("@") != -1) || (dominio1.indexOf("@") == -1 && dominio2.indexOf("@") == -1)) {
        return dominio1.equalsIgnoreCase(dominio2);
      }
     else {
        String semArroba1;
        String semArroba2;
        if (dominio1.indexOf("@") == -1) {
          semArroba1=dominio1;
        }
     else {
          semArroba1=dominio1.substring(0,dominio1.indexOf("@"));
        }
        if (dominio2.indexOf("@") == -1) {
          semArroba2=dominio2;
        }
     else {
          semArroba2=dominio2.substring(0,dominio2.indexOf("@"));
        }
        return semArroba1.equalsIgnoreCase(semArroba2);
      }
    }
}
