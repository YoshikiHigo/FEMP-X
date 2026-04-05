package all;

import java.util.*;

public class ClonePair6627 {

    boolean method1(String pName1,String pName2){
      String[] name1TokensArray=pName1.split(" ");
      String[] name2TokensArray=pName2.split(" ");
      Set<String> name1Set=new HashSet<String>();
      for (int i=0; i < name1TokensArray.length; i++) {
        name1Set.add(name1TokensArray[i]);
      }
      Set<String> name2Set=new HashSet<String>();
      for (int i=0; i < name2TokensArray.length; i++) {
        name2Set.add(name2TokensArray[i]);
      }
      int name1SetSize=name1Set.size();
      int name2SetSize=name2Set.size();
      if (Math.abs(name1SetSize - name2SetSize) > 1) {
        return false;
      }
      Set<String> nameASet=name1Set;
      Set<String> nameBSet=name2Set;
      if (name1SetSize > name2SetSize) {
        nameASet=name2Set;
        nameBSet=name1Set;
      }
      if (nameASet.containsAll(nameBSet)) {
        return true;
      }
      return false;
    }

    boolean method2(String balise,String name){
      int length=balise.length();
      if (!balise.isEmpty() && balise.charAt(length - 1) == '*') {
        return name.startsWith(balise.substring(0,length - 1));
      }
     else {
        return name.equals(balise);
      }
    }
}
