package all;

import java.util.HashMap;
import java.util.Map;

public class ClonePair10814 {

    Map<String,String> method1(String keys,String values,String separator){
      String[] arKeys=keys.split("\\" + separator);
      String[] arValues=values.split("\\" + separator);
      Map<String,String> map=new HashMap<String,String>();
      int cKeyId=0;
      for (  String cKey : arKeys) {
        String cVal="";
        if (cKeyId < arValues.length)     cVal=arValues[cKeyId];
        if (!cKey.isEmpty())     map.put(cKey,cVal);
      }
      return map;
    }

    Map<String,String> method2(String keys,String values,String separator){
      Map<String,String> map=new HashMap<String,String>();
      String[] arKeys=keys.split("\\" + separator);
      if (values.isEmpty()) {
        for (    String cKey : arKeys)     if (!cKey.isEmpty())     map.put(cKey,"");
        return map;
      }
      String[] arValues=values.split("\\" + separator);
      int cKeyId=0;
      for (  String cKey : arKeys) {
        String cVal="";
        if (cKeyId < arValues.length)     cVal=arValues[cKeyId++];
        if (!cKey.isEmpty())     map.put(cKey,cVal);
      }
      return map;
    }
}
