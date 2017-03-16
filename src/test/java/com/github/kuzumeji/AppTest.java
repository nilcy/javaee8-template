// ========================================================================
// Copyright (C) Kuzumeji Software Team. All rights reserved.
// GNU AFFERO GENERAL PUBLIC LICENSE Version 3, 19 November 2007
// http://www.gnu.org/licenses/agpl-3.0.txt
// ========================================================================
package com.github.kuzumeji;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import org.junit.Test;
/**
 * {@link App} �̃e�X�g
 */
@SuppressWarnings("static-method")
public class AppTest {
    /**
     * {@link App#getGreeting()} �̃e�X�g
     */
    @Test
    public void getGreeting() {
        assertThat(new App().getGreeting(), is("Hello world."));
    }
}
