package all;

public class ClonePair5298 {

    boolean method1(int npcId){
      if (npcId < 18009 || npcId > 18108)   return false;
      int identifier=npcId % 10;
      return (identifier == 4 || identifier == 9);
    }

    boolean method2(int npcId){
      if (npcId < 18009 || npcId > 18108)   return false;
      int identifier=npcId % 10;
      return identifier == 4 || identifier == 9;
    }
}
