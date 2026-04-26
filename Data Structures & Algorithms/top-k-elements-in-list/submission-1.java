class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        return Arrays.stream(nums)
            .boxed()
            .collect(Collectors.groupingBy(i -> i, Collectors.counting())) //Count
            .entrySet().stream()
            .sorted((a, b) -> {
                int cmp = b.getValue().compareTo(a.getValue()); // Higher frequency first
                return (cmp != 0) ? cmp : Integer.compare(a.getKey(), b.getKey()); // Tiebreaker: Value ascending
            })
            .flatMap(entry -> Collections.nCopies(entry.getValue().intValue(), entry.getKey()).stream()) // Expand
            .distinct()
            .limit(k)
            .mapToInt(i -> i)
            .toArray();
    }
}
