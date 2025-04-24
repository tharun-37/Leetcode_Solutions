int* findDiagonalOrder(int** matrix, int matrixSize, int* matrixColSize, int* returnSize) {
    if (matrixSize == 0 || matrixColSize == 0) {
        *returnSize = 0;
        return NULL;
    }

    int rows = matrixSize;
    int cols = matrixColSize[0];
    int total = rows * cols;
    int* result = (int*)malloc(total * sizeof(int));
    *returnSize = total;

    int row = 0, col = 0, d = 1;
    for (int i = 0; i < total; i++) {
        result[i] = matrix[row][col];
        row -= d;
        col += d;

        if (row >= rows) { row = rows - 1; col += 2; d = -d; }
        if (col >= cols) { col = cols - 1; row += 2; d = -d; }
        if (row < 0) { row = 0; d = -d; }
        if (col < 0) { col = 0; d = -d; }
    }

    return result;
}

