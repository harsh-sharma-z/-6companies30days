class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        Set<Integer> uwu = new HashSet();
        uwu.add(dist(p1,p2));
        uwu.add(dist(p1,p3));
        uwu.add(dist(p1,p4));
        uwu.add(dist(p2,p3));
        uwu.add(dist(p2,p4));
        uwu.add(dist(p3,p4));
        return !uwu.contains(0) && uwu.size() == 2;
    }
    private int dist(int[] x, int[] y)
    {
        return (x[0]-y[0])*(x[0]-y[0]) + (x[1]-y[1])*(x[1]-y[1]);
    }
}
