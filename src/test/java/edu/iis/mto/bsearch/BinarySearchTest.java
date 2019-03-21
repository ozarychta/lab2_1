package edu.iis.mto.bsearch;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test
    public void search_sequenceLengthIsOne_keyIsFound() {
        int key = 3;
        int[] seq = {3};

        SearchResult searchResult = BinarySearch.search(key, seq);
    }

    @Test
    public void search_sequenceLengthIsOne_keyIsNotFound() {
        int key = 10;
        int[] seq = {3};

        SearchResult searchResult = BinarySearch.search(key, seq);
    }

    @Test
    public void search_sequenceLengthIsGreaterThanOne_keyIsTheFirstElement() {
        int key = 1;
        int[] seq = {1,2,3,4,5};

        SearchResult searchResult = BinarySearch.search(key, seq);
    }

    @Test
    public void search_sequenceLengthIsGreaterThanOne_keyIsTheLastElement() {
        int key = 5;
        int[] seq = {1,2,3,4,5};

        SearchResult searchResult = BinarySearch.search(key, seq);
    }

    @Test
    public void search_sequenceLengthIsGreaterThanOne_keyIsTheMiddleElement() {
        int key = 3;
        int[] seq = {1,2,3,4,5};

        SearchResult searchResult = BinarySearch.search(key, seq);
    }

    @Test
    public void search_sequenceLengthIsGreaterThanOne_keyIsNotFound() {
        int key = 10;
        int[] seq = {1,2,3,4,5};

        SearchResult searchResult = BinarySearch.search(key, seq);
    }
}
