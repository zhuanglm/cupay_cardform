package com.braintreepayments.cardform.view;

import com.braintreepayments.cardform.R;
import com.braintreepayments.cardform.test.TestActivity;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

@RunWith(RobolectricGradleTestRunner.class)
public class PostalCodeEditTextTest {

    private PostalCodeEditText mView;

    @Before
    public void setup() {
        mView = (PostalCodeEditText) Robolectric.setupActivity(TestActivity.class)
                .findViewById(R.id.bt_card_form_postal_code);
    }

    @Test
    public void invalidIfEmpty() {
        assertFalse(mView.isValid());
    }

    @Test
    public void validIfNotEmpty() {
        mView.setText("12345");
        assertTrue(mView.isValid());
    }
}