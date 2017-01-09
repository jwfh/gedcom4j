/*
 * Copyright (c) 2009-2016 Matthew R. Harrah
 *
 * MIT License
 *
 * Permission is hereby granted, free of charge, to any person
 * obtaining a copy of this software and associated documentation
 * files (the "Software"), to deal in the Software without
 * restriction, including without limitation the rights to use,
 * copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the
 * Software is furnished to do so, subject to the following
 * conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
 * OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 * OTHER DEALINGS IN THE SOFTWARE.
 */
package org.gedcom4j.model.enumerations;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Test for {@link LanguageID}
 * 
 * @author frizbog
 */
public class LanguageIDTest {

    /**
     * Test {@link LanguageID#getDescription()}
     */
    @Test
    public void testDescription() {
        assertEquals("Albanian", LanguageID.ALBANIAN.getDescription());
    }

    /**
     * Test {@link LanguageID#getForCode(String)}
     */
    @Test
    public void testGetForCode() {
        assertEquals(LanguageID.AFRIKAANS, LanguageID.getForCode("Afrikaans"));
        assertEquals(LanguageID.BENGALI, LanguageID.getForCode("Bengali"));
        assertEquals(LanguageID.CHURCH, LanguageID.getForCode("Church"));
        assertEquals(null, LanguageID.getForCode("undefined"));
    }

    /**
     * Test {@link LanguageID#toString()}
     */
    @Test
    public void testToString() {
        assertEquals("Afrikaans", LanguageID.AFRIKAANS.toString());
    }

}