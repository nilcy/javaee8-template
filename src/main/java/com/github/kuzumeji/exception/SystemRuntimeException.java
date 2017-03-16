// ========================================================================
// Copyright (C) Kuzumeji Software Team. All rights reserved.
// GNU AFFERO GENERAL PUBLIC LICENSE Version 3, 19 November 2007
// http://www.gnu.org/licenses/agpl-3.0.txt
// ========================================================================
package com.github.kuzumeji.exception;
import org.apache.commons.lang3.exception.ExceptionContext;
/**
 * システムのランタイム例外
 * @author nilcy
 */
public class SystemRuntimeException extends AbstractRuntimeException {
    /** 直列化バージョン */
    private static final long serialVersionUID = -6934777354687028469L;
    /** コンストラクタ */
    public SystemRuntimeException() {
    }
    /**
     * コンストラクタ
     * @param message メッセージ
     * @param cause 例外オブジェクト
     * @param context 例外コンテキスト
     */
    public SystemRuntimeException(final String message, final Throwable cause, final ExceptionContext context) {
        super(message, cause, context);
    }
    /**
     * コンストラクタ
     * @param message メッセージ
     * @param cause 例外オブジェクト
     */
    public SystemRuntimeException(final String message, final Throwable cause) {
        super(message, cause);
    }
    /**
     * コンストラクタ
     * @param message メッセージ
     */
    public SystemRuntimeException(final String message) {
        super(message);
    }
    /**
     * コンストラクタ
     * @param cause 例外オブジェクト
     */
    public SystemRuntimeException(final Throwable cause) {
        super(cause);
    }
}
