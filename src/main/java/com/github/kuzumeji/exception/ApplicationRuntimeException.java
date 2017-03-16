// ========================================================================
// Copyright (C) Kuzumeji Software Team. All rights reserved.
// GNU AFFERO GENERAL PUBLIC LICENSE Version 3, 19 November 2007
// http://www.gnu.org/licenses/agpl-3.0.txt
// ========================================================================
package com.github.kuzumeji.exception;
import org.apache.commons.lang3.exception.ExceptionContext;
/**
 * アプリケーションのランタイム例外
 * @author nilcy
 */
public class ApplicationRuntimeException extends AbstractRuntimeException {
    /** 直列化バージョン */
    private static final long serialVersionUID = -2589124830202054442L;
    /** コンストラクタ */
    public ApplicationRuntimeException() {
    }
    /**
     * コンストラクタ
     * @param message メッセージ
     * @param cause 例外オブジェクト
     * @param context 例外コンテキスト
     */
    public ApplicationRuntimeException(final String message, final Throwable cause, final ExceptionContext context) {
        super(message, cause, context);
    }
    /**
     * コンストラクタ
     * @param message メッセージ
     * @param cause 例外オブジェクト
     */
    public ApplicationRuntimeException(final String message, final Throwable cause) {
        super(message, cause);
    }
    /**
     * コンストラクタ
     * @param message メッセージ
     */
    public ApplicationRuntimeException(final String message) {
        super(message);
    }
    /**
     * コンストラクタ
     * @param cause 例外オブジェクト
     */
    public ApplicationRuntimeException(final Throwable cause) {
        super(cause);
    }
}
