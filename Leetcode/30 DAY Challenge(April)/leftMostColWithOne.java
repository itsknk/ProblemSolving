class leftMostColWithOne {
    public int leftMostColumnWithOne(BinaryMatrix binaryMatrix) {
         List<Integer> dimensions = binaryMatrix.dimensions();
        int n = dimensions.get(0);
        int m = dimensions.get(1);

        int i = 0;
        int j = m - 1;
        int leftmost = -1;

        while (i < n && j >= 0) {

            if (binaryMatrix.get(i, j) == 1) {
                leftmost = j;
                j--; // move left
            } else {
                i++; // move down
            }

        }

        return leftmost;
    }
}
