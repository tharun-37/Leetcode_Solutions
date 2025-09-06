import java.util.ArrayList;
import java.util.List;

class Solution {
    private List<String> result = new ArrayList<>();
    private final String[] MAPPING = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    private String digits;

    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return result;
        }
        this.digits = digits;
        findCombinations(0, new StringBuilder());
        return result;
    }

    private void findCombinations(int index, StringBuilder currentCombination) {
        if (index == digits.length()) {
            result.add(currentCombination.toString());
            return;
        }

        char digitChar = digits.charAt(index);
        String letters = MAPPING[digitChar - '0'];

        for (char letter : letters.toCharArray()) {
            currentCombination.append(letter);
            findCombinations(index + 1, currentCombination);
            currentCombination.deleteCharAt(currentCombination.length() - 1);
        }
    }
}
