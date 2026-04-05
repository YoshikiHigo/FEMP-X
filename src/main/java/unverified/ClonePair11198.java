package unverified;

public class ClonePair11198 {

    boolean method1(String nodeName){
      nodeName=nodeName.trim();
      if (nodeName.startsWith("/"))   nodeName=nodeName.substring(1).trim();
      if (nodeName.endsWith("/"))   nodeName=nodeName.substring(0,nodeName.length() - 1).trim();
      return !nodeName.equalsIgnoreCase("a") && !nodeName.equalsIgnoreCase("b") && !nodeName.equalsIgnoreCase("i");
    }

    boolean method2(String url){
      boolean retVal=true;
      char[] ch=url.toCharArray();
      int index=0;
      while (index < ch.length) {
        if (!((ch[index] > 96 && ch[index] < 123) || (ch[index] > 46 && ch[index] < 59) || ch[index] == 126 || ch[index] == 63 || ch[index] == 56)) {
          retVal=false;
        }
      }
      return retVal;
    }
}
