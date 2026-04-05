package all;

public class ClonePair7881 {

    boolean method1(String[] lines){
      if (lines[3].length() >= 6) {
        String line4trimmed=lines[3].trim();
        if (line4trimmed.endsWith("V2000") || line4trimmed.endsWith("v2000"))     return true;
        try {
          Integer.parseInt(lines[3].substring(0,3).trim());
          Integer.parseInt(lines[3].substring(3,6).trim());
          return (lines[0].indexOf("@<TRIPOS>") != 0 && lines[1].indexOf("@<TRIPOS>") != 0 && lines[2].indexOf("@<TRIPOS>") != 0);
        }
     catch (    NumberFormatException nfe) {
        }
      }
      return false;
    }

    boolean method2(String[] lines){
      if (lines[3].length() >= 6) {
        String line4trimmed=lines[3].trim();
        if (line4trimmed.endsWith("V2000") || line4trimmed.endsWith("v2000"))     return true;
        try {
          Integer.parseInt(lines[3].substring(0,3).trim());
          Integer.parseInt(lines[3].substring(3,6).trim());
          return true;
        }
     catch (    NumberFormatException nfe) {
        }
      }
      return false;
    }
}
