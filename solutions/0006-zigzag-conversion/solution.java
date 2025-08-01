class Solution {
    public String convert(String s, int nr) {
        if (nr == 1 || s.length() <= nr) {
            return s;
        }

        StringBuilder[] rows = new StringBuilder[nr];

        for (int i = 0; i < nr; i++) {
            rows[i] = new StringBuilder();
        }

        int in = 0;
        int st = 1;

        for (char c : s.toCharArray()) {
            rows[in].append(c);

            if (in == 0) {
                st = 1;
            } else if (in == nr - 1) {
                st = -1;
            }

            in += st;
        }

        StringBuilder result = new StringBuilder();

        for (StringBuilder sb : rows) {
            result.append(sb);
        }

        return result.toString();
    }
}

