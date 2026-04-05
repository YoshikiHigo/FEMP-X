package all;

public class ClonePair11042 {

    boolean method1(String[] bannedIPList,String ipAddress){
      if (bannedIPList == null) {
        return false;
      }
      for (int i=0; i < bannedIPList.length; i++) {
        String bannedIP=bannedIPList[i];
        if (ipAddress.matches(bannedIP)) {
          return true;
        }
      }
      return false;
    }

    boolean method2(String[] actives,String name){
      if (actives == null) {
        return false;
      }
      for (int i=0; i < actives.length; i++) {
        if (name.matches(actives[i])) {
          return true;
        }
      }
      return false;
    }
}
