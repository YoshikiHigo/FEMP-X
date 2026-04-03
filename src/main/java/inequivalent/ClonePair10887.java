package inequivalent;

import java.util.TreeSet;

public class ClonePair10887 {

    Object method1(Object fromObject) {
        final String s = (String) fromObject;
        if (s.equals("-1")) {
            return new int[]{-1};
        }
        final String[] parts = s.split(",");
        final TreeSet<Integer> set = new TreeSet<Integer>();
        for (final String p : parts) {
            if (p.matches("-?\\d+")) {
                final int i = Integer.parseInt(p);
                set.add(i);
            } else if (p.matches("-?\\d+--?\\d+")) {
                final String[] q;
                if (p.charAt(0) == '-') {
                    q = p.substring(1).split("-", 2);
                    q[0] = "-" + q[0];
                    q[1] = "-" + q[1];
                } else {
                    q = p.split("-", 2);
                }
                final int start = Integer.parseInt(q[0]);
                final int stop = Integer.parseInt(q[1]);
                for (int j = start; j <= stop; j++) {
                    set.add(j);
                }
            }
        }
        final int[] list = new int[set.size()];
        int c = 0;
        for (final Integer integer : set) {
            list[c++] = integer;
        }
        return list;
    }

    Object method2(Object fromObject) {
        final String s = (String) fromObject;
        final String[] parts = s.split(",");
        final TreeSet<Integer> set = new TreeSet<Integer>();
        for (final String p : parts) {
            if (p.matches("\\d+")) {
                final int i = Integer.parseInt(p);
                set.add(i);
            } else if (p.matches("\\d+-\\d+")) {
                final String[] q = p.split("-");
                final int start = Integer.parseInt(q[0]);
                final int stop = Integer.parseInt(q[1]);
                for (int j = start; j <= stop; j++) {
                    set.add(j);
                }
            }
        }
        final int[] list = new int[set.size()];
        int c = 0;
        for (final Integer integer : set) {
            list[c++] = integer;
        }
        return list;
    }
}
