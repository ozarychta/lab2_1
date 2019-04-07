package edu.iis.mto.bsearch;

import static org.junit.Assert.assertThat;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;

public class BinarySearchTest {

    @Test
    public void search_sequenceLengthIsOne_keyIsFound() {
        int key = 3;
        int[] seq = {3};

        SearchResult searchResult = BinarySearch.search(key, seq);

        assertThat(searchResult.getPosition(), is(0));
    }

    @Test
    public void search_sequenceLengthIsOne_keyIsNotFound() {
        int key = 10;
        int[] seq = {1};

        SearchResult searchResult = BinarySearch.search(key, seq);

        assertThat(searchResult.isFound(), is(false));
    }

    @Test
    public void search_sequenceLengthIsGreaterThanOne_keyIsTheFirstElement() {
        int key = -1;
        int[] seq = {-1,2,3,4,5};

        SearchResult searchResult = BinarySearch.search(key, seq);

        assertThat(searchResult.getPosition(), is(0));
    }

    @Test
    public void search_sequenceLengthIsGreaterThanOne_keyIsTheLastElement() {
        int key = 55;
        int[] seq = {11,33,55};

        SearchResult searchResult = BinarySearch.search(key, seq);

        assertThat(searchResult.getPosition(), is(2));
    }

    @Test
    public void search_sequenceLengthIsGreaterThanOneAndOdd_keyIsTheMiddleElement() {
        int key = 33;
        int[] seq = {-5,3,22,33,66,77,101};

        SearchResult searchResult = BinarySearch.search(key, seq);

        assertThat(searchResult.getPosition(), is(3));
    }

    @Test
    public void search_sequenceLengthIsGreaterThanOneAndEven_keyIsTheMiddleElement() {
        int key = 3;
        int[] seq = {1,2,3,44};

        SearchResult searchResult = BinarySearch.search(key, seq);

        assertThat(searchResult.getPosition(), is(2));
    }

    @Test
    public void search_sequenceLengthIsGreaterThanOne_keyIsNotFound() {
        int key = 10;
        int[] seq = {-13,2,3,24,57,66};

        SearchResult searchResult = BinarySearch.search(key, seq);

        assertThat(searchResult.isFound(), is(false));
    }

    @Test(expected = IllegalArgumentException.class)
    public void search_sequenceIsEmpty_exceptionIsThrown() {
        int key = 10;
        int[] seq = {};

        BinarySearch.search(key, seq);
    }
}
