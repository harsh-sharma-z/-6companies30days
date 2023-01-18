class Solution {
    public void insertAsc(List<Integer> list, Integer element) {
        int idx = Collections.binarySearch(list, element);
        list.add(idx < 0 ? -idx - 1 : idx, element);
    }

    public long numberOfPairs(int[] nums1, int[] nums2, int diff) {
        long r = 0;
        int[] ndiff = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++)
            ndiff[i] = nums1[i] - nums2[i];
        List<Integer> lst = new ArrayList<>();
        for (int i = ndiff.length - 2; i >= 0; i--) {
            insertAsc(lst, ndiff[i + 1]);
            int idx = Collections.binarySearch(lst, ndiff[i] - diff);
            idx = idx < 0 ? -idx - 1 : idx;
            while (idx > 0 && idx < lst.size() && lst.get(idx).equals(lst.get(idx - 1)))
                idx--;
            r += lst.size() - idx;
        }
        return r;
    }
}
