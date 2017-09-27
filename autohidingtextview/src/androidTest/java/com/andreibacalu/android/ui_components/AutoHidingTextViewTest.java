package com.andreibacalu.android.ui_components;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.view.View;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class AutoHidingTextViewTest {

    private Context appContext = InstrumentationRegistry.getTargetContext();

    @Test
    public void hide_textIsNull() throws Exception {
        AutoHidingTextView autoHidingTextView = new AutoHidingTextView(appContext);

        autoHidingTextView.setText(null);

        assertEquals(autoHidingTextView.getVisibility(), View.GONE);
    }

    @Test
    public void hide_textIsEmpty() throws Exception {
        AutoHidingTextView autoHidingTextView = new AutoHidingTextView(appContext);

        autoHidingTextView.setText("");

        assertEquals(autoHidingTextView.getVisibility(), View.GONE);
    }

    @Test
    public void hide_textHasOnlySpaces() throws Exception {
        AutoHidingTextView autoHidingTextView = new AutoHidingTextView(appContext);

        autoHidingTextView.setText("    ");

        assertEquals(autoHidingTextView.getVisibility(), View.GONE);
    }

    @Test
    public void show_textNotEmpty() throws Exception {
        AutoHidingTextView autoHidingTextView = new AutoHidingTextView(appContext);

        autoHidingTextView.setText("abcd");

        assertEquals(autoHidingTextView.getVisibility(), View.VISIBLE);
    }

    @Test
    public void show_textNotEmptyWithSpaces() throws Exception {
        AutoHidingTextView autoHidingTextView = new AutoHidingTextView(appContext);

        autoHidingTextView.setText("   a b c d  ");

        assertEquals(autoHidingTextView.getVisibility(), View.VISIBLE);
    }
}
