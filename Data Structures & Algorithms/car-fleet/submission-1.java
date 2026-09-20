
class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;

        Integer[] indices = new Integer[n];

        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }

        Arrays.sort(indices, (a, b) -> Integer.compare(position[b], position[a]));

        Stack<Double> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            int index = indices[i];

            double t = (double)(target - position[index]) / speed[index];

            if (stack.isEmpty() || t > stack.peek()) {
                stack.push(t);
            }
        }

        return stack.size();
    }
}