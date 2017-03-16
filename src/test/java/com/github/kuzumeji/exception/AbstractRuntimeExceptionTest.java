// ========================================================================
// Copyright (C) Kuzumeji Software Team. All rights reserved.
// GNU AFFERO GENERAL PUBLIC LICENSE Version 3, 19 November 2007
// http://www.gnu.org/licenses/agpl-3.0.txt
// ========================================================================
package com.github.kuzumeji.exception;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import org.apache.commons.lang3.exception.ContextedRuntimeException;
import org.apache.commons.lang3.exception.ExceptionContext;
import org.apache.commons.lang3.tuple.Pair;
import org.junit.Test;
/**
 * {@link AbstractRuntimeException}
 * @author nilcy
 */
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@SuppressWarnings("all")
public class AbstractRuntimeExceptionTest {
    /** ロガー */
    private static final Logger LOG = LoggerFactory.getLogger(AbstractRuntimeExceptionTest.class);
    /** テスト対象 */
    TesteeRuntimeException testee;
    /**
     * {@link AbstractRuntimeException#AbstractRuntimeException()}.
     */
    @Test
    public void testAbstractRuntimeException() {
        testee = new TesteeRuntimeException();
        assertThat(testee, is(not(nullValue())));
        try {
            throw new TesteeRuntimeException().addContextValue("label1", "value1").addContextValue("label2", "value2");
        } catch (final TesteeRuntimeException e) {
            LOG.warn(e.getMessage());
            for (final Pair<String, Object> entry : e.getContextEntries()) {
                LOG.debug("{} : {}", entry.getKey(), entry.getValue());
            }
            assertThat(e.getContextValues("label1").iterator().next(), is("value1"));
            assertThat(e.getContextValues("label2").iterator().next(), is("value2"));
        }
    }
    /**
     * {@link AbstractRuntimeException#AbstractRuntimeException(java.lang.String, java.lang.Throwable, org.apache.commons.lang3.exception.ExceptionContext)}.
     */
    @Test
    public void testAbstractRuntimeExceptionStringThrowableExceptionContext() {
        testee = new TesteeRuntimeException("", new Throwable(), new ContextedRuntimeException());
        assertThat(testee, is(not(nullValue())));
    }
    /**
     * {@link AbstractRuntimeException#AbstractRuntimeException(java.lang.String, java.lang.Throwable)}.
     */
    @Test
    public void testAbstractRuntimeExceptionStringThrowable() {
        testee = new TesteeRuntimeException("", new Throwable());
        assertThat(testee, is(not(nullValue())));
    }
    /**
     * {@link AbstractRuntimeException#AbstractRuntimeException(java.lang.String)}.
     */
    @Test
    public void testAbstractRuntimeExceptionString() {
        testee = new TesteeRuntimeException("");
        assertThat(testee, is(not(nullValue())));
    }
    /**
     * {@link AbstractRuntimeException#AbstractRuntimeException(java.lang.Throwable)}.
     */
    @Test
    public void testAbstractRuntimeExceptionThrowable() {
        testee = new TesteeRuntimeException(new ContextedRuntimeException());
        assertThat(testee, is(not(nullValue())));
    }
}
@SuppressWarnings("all")
class TesteeRuntimeException extends AbstractRuntimeException {
    public TesteeRuntimeException() {
    }
    public TesteeRuntimeException(final String message, final Throwable cause, final ExceptionContext context) {
        super(message, cause, context);
    }
    public TesteeRuntimeException(final String message, final Throwable cause) {
        super(message, cause);
    }
    public TesteeRuntimeException(final String message) {
        super(message);
    }
    public TesteeRuntimeException(final Throwable cause) {
        super(cause);
    }
}
