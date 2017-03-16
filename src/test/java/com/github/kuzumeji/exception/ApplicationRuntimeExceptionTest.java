// ========================================================================
// Copyright (C) Kuzumeji Software Team. All rights reserved.
// GNU AFFERO GENERAL PUBLIC LICENSE Version 3, 19 November 2007
// http://www.gnu.org/licenses/agpl-3.0.txt
// ========================================================================
package com.github.kuzumeji.exception;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import org.apache.commons.lang3.exception.ContextedRuntimeException;
import org.apache.commons.lang3.tuple.Pair;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * {@link ApplicationRuntimeException}
 * @author nilcy
 */
@SuppressWarnings("all")
public class ApplicationRuntimeExceptionTest {
    /** ロガー */
    private static final Logger LOG = LoggerFactory.getLogger(ApplicationRuntimeExceptionTest.class);
    /** テスト対象 */
    ApplicationRuntimeException testee;
    /**
     * {@link ApplicationRuntimeException#ApplicationRuntimeException()}.
     */
    @Test
    public void testApplicationRuntimeException() {
        testee = new ApplicationRuntimeException();
        assertThat(testee, is(not(nullValue())));
        try {
            throw new ApplicationRuntimeException().addContextValue("label1", "value1").addContextValue("label2",
                "value2");
        } catch (final ApplicationRuntimeException e) {
            LOG.warn(e.getMessage());
            for (final Pair<String, Object> entry : e.getContextEntries()) {
                LOG.debug("{} : {}", entry.getKey(), entry.getValue());
            }
            assertThat(e.getContextValues("label1").iterator().next(), is("value1"));
            assertThat(e.getContextValues("label2").iterator().next(), is("value2"));
        }
    }
    /**
     * {@link ApplicationRuntimeException#ApplicationRuntimeException(java.lang.String, java.lang.Throwable, org.apache.commons.lang3.exception.ExceptionContext)}.
     */
    @Test
    public void testApplicationRuntimeExceptionStringThrowableExceptionContext() {
        testee = new ApplicationRuntimeException("", new Throwable(), new ContextedRuntimeException());
        assertThat(testee, is(not(nullValue())));
    }
    /**
     * {@link ApplicationRuntimeException#ApplicationRuntimeException(java.lang.String, java.lang.Throwable)}.
     */
    @Test
    public void testApplicationRuntimeExceptionStringThrowable() {
        testee = new ApplicationRuntimeException("", new Throwable());
        assertThat(testee, is(not(nullValue())));
    }
    /**
     * {@link ApplicationRuntimeException#ApplicationRuntimeException(java.lang.String)}.
     */
    @Test
    public void testApplicationRuntimeExceptionString() {
        testee = new ApplicationRuntimeException("");
        assertThat(testee, is(not(nullValue())));
    }
    /**
     * {@link ApplicationRuntimeException#ApplicationRuntimeException(java.lang.Throwable)}.
     */
    @Test
    public void testApplicationRuntimeExceptionThrowable() {
        testee = new ApplicationRuntimeException(new ContextedRuntimeException());
        assertThat(testee, is(not(nullValue())));
    }
}
