package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchTest {

    @Test
    void searchMaxValueInMatrice2() {
        int[][] matrix = new int[][]{{1, 2, 3, 4, 5, 6, 7},
                {12, 2, 3, 4, 5, 6, 7},
                {1, 2, 3, 4, 5, 6, 7},
                {1, 12, 3, 12, 5, 6, 7},
                {1, 2, 3, 4, 5, 111, 7},
                {1, 2, 3, 4, 5, 6, 7},
                {1, 2, 3, 4, 5, 6, 7}};

       Main main = new Main();
       int value = main.searchMaxValueInMatrice(matrix);
       assertEquals(111,value);
    }
}