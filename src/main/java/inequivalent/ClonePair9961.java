package inequivalent;

import java.util.List;

public class ClonePair9961 {

    String[] method1(List<String> folders) {
        String[] relativePaths = new String[folders.size()];
        for (int i = 0; i < relativePaths.length; i++) {
            String folder = folders.get(i);
            int startIndex = Math.min(1, folder.length() - 1);
            relativePaths[i] = folders.get(i).substring(startIndex);
        }
        return relativePaths;
    }

    String[] method2(List<String> series) {
        final String[] props = new String[series.size()];
        int j = 0;
        for (String prop : series) {
            if (prop.charAt(0) == '.') {
                prop = prop.substring(1);
            }
            props[j++] = prop;
        }
        return props;
    }
}
