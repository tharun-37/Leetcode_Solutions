// Last updated: 5/16/2026, 10:16:33 PM
class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int arr[] = new int[num_people];
        int rot = 0;
        while (candies > 0) {
            for (int i = 0; i < num_people; i++) {
                if (candies <= (rot * num_people) + (i + 1)) {
                    arr[i] += candies;
                    candies = 0;
                    break;
                }
                arr[i] += (rot * num_people) + (i + 1);
                candies -= (rot * num_people) + (i + 1);
            }
            rot++;
        }
        return arr;
    }
}