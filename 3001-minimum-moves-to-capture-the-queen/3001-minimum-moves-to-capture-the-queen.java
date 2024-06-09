class Solution {
    public int minMovesToCaptureTheQueen(int rookX, int rookY, int bishopX, int bishopY, int queenX, int queenY) {
        // Check if the rook can directly capture the queen
        if (rookX == queenX || rookY == queenY) {
            // Check if the bishop is blocking the rook
            if ((rookX == queenX && bishopX == rookX && between(rookY, bishopY, queenY)) ||
                (rookY == queenY && bishopY == rookY && between(rookX, bishopX, queenX))) {
                return 2;  // The rook is blocked by the bishop
            }
            return 1;  // Direct capture
        }

        // Check if the bishop can directly capture the queen
        if (Math.abs(bishopX - queenX) == Math.abs(bishopY - queenY)) {
            // Check if the rook is blocking the bishop
            if (Math.abs(bishopX - rookX) == Math.abs(bishopY - rookY) &&
                between(bishopX, rookX, queenX) && between(bishopY, rookY, queenY)) {
                return 2;  // The bishop is blocked by the rook
            }
            return 1;  // Direct capture
        }

        // If neither piece can capture directly, it will take at least two moves
        return 2;
    }

    // Helper method to check if 'mid' is between 'start' and 'end'
    private boolean between(int start, int mid, int end) {
        return (start < mid && mid < end) || (start > mid && mid > end);
    }

}