package all;

public class ClonePair9218 {

    boolean method1(String dominio1,String dominio2){
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

    boolean method2(String s1,String s2){
      if (s1.length() < s2.length())   return false;
      for (int i=0; i < s2.length(); i++) {
        char c1=s1.charAt(i), c2=s2.charAt(i);
        if (c1 != c2 && Character.toLowerCase(c2) != c1 && Character.toUpperCase(c2) != c1)     return false;
      }
      return true;
    }
}
