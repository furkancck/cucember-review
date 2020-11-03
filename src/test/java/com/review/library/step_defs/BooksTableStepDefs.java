package com.review.library.step_defs;

import com.review.library.pages.BooksPage;
import com.review.library.utilities.BrowserUtilities;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

import static org.junit.Assert.*;

public class BooksTableStepDefs {
    BooksPage booksPage = new BooksPage();

    @Then("books table should contain results matching {word}")
    public void books_table_should_contain_results_matching(String book) {
        List<String> actualRows = BrowserUtilities.getElementsText(booksPage.allRows);
        boolean found = true;
        for (String row : actualRows) {
            if (!row.contains(book)) {
                found = false;
            }
        }
     assertTrue(book + " was not found", found);
    }

}
