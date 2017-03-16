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
 * {@link SystemRuntimeException}
 * @author nilcy
 */
@SuppressWarnings("all")
public class SystemRuntimeExceptionTest {
    /** ロガー */
    private static final Logger LOG = LoggerFactory.getLogger(SystemRuntimeExceptionTest.class);
    /** テスト対象 */
    SystemRuntimeException testee;
    /**
     * {@link SystemRuntimeException#SystemRuntimeException()}.
     */
    @Test
    public void testSystemRuntimeException() {
        testee = new SystemRuntimeException();
        assertThat(testee, is(not(nullValue())));
        try {
            throw new SystemRuntimeException().addContextValue("label1", "value1").addContextValue("label2", "value2");
        } catch (final SystemRuntimeException e) {
            LOG.warn(e.getMessage());
            for (final Pair<String, Object> entry : e.getContextEntries()) {
                LOG.debug("{} : {}", entry.getKey(), entry.getValue());
            }
            assertThat(e.getContextValues("label1").iterator().next(), is("value1"));
            assertThat(e.getContextValues("label2").iterator().next(), is("value2"));
        }
    }
    /**
     * {@link SystemRuntimeException#SystemRuntimeException(java.lang.String, java.lang.Throwable, org.apache.commons.lang3.exception.ExceptionContext)}.
     */
    @Test
    public void testSystemRuntimeExceptionStringThrowableExceptionContext() {
        testee = new SystemRuntimeException("", new Throwable(), new ContextedRuntimeException());
        assertThat(testee, is(not(nullValue())));
    }
    /**
     * {@link SystemRuntimeException#SystemRuntimeException(java.lang.String, java.lang.Throwable)}.
     */
    @Test
    public void testSystemRuntimeExceptionStringThrowable() {
        testee = new SystemRuntimeException("", new Throwable());
        assertThat(testee, is(not(nullValue())));
    }
    /**
     * {@link SystemRuntimeException#SystemRuntimeException(java.lang.String)}.
     */
    @Test
    public void testSystemRuntimeExceptionString() {
        testee = new SystemRuntimeException("");
        assertThat(testee, is(not(nullValue())));
    }
    /**
     * {@link SystemRuntimeException#SystemRuntimeException(java.lang.Throwable)}.
     */
    @Test
    public void testSystemRuntimeExceptionThrowable() {
        testee = new SystemRuntimeException(new ContextedRuntimeException());
        assertThat(testee, is(not(nullValue())));
    }
}
