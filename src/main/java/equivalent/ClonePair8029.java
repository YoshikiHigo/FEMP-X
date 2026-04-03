package equivalent;

import java.util.HashMap;
import java.util.List;

public class ClonePair8029 {
    int method1(String _id, List<HashMap<String, Object>> list, boolean _isInstanciated) {
        int nb = 0;
        if (!_isInstanciated) nb = 1;
        for (HashMap<String, Object> hashMap : list) {
            if (hashMap.get("id").equals(_id)) {
                nb = ((Integer) hashMap.get("nbOccurences")).intValue();
                break;
            }
        }
        return nb;
    }

    int method2(String _id, List<HashMap<String, Object>> list, boolean _isInstanciated) {
        int nb;
        if (!_isInstanciated) nb = 1;
        else nb = 0;
        for (HashMap<String, Object> hashMap : list) {
            if (hashMap.get("id").equals(_id)) {
                nb = ((Integer) hashMap.get("nbOccurences")).intValue();
                break;
            }
        }
        return nb;
    }
}
