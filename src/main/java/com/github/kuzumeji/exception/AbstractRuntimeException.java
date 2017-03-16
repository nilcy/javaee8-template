// ========================================================================
// Copyright (C) Kuzumeji Software Team. All rights reserved.
// GNU AFFERO GENERAL PUBLIC LICENSE Version 3, 19 November 2007
// http://www.gnu.org/licenses/agpl-3.0.txt
// ========================================================================
package com.github.kuzumeji.exception;
import org.apache.commons.lang3.exception.ContextedRuntimeException;
import org.apache.commons.lang3.exception.ExceptionContext;
/**
 * ランタイム例外の基底クラス
 * @author nilcy
 */
public abstract class AbstractRuntimeException extends ContextedRuntimeException {
    /** 直列化バージョン */
    private static final long serialVersionUID = 1653712792261549683L;
    /** コンストラクタ */
    public AbstractRuntimeException() {
    }
    /**
     * コンストラクタ
     * @param message メッセージ
     * @param cause 例外オブジェクト
     * @param context 例外コンテキスト
     */
    public AbstractRuntimeException(final String message, final Throwable cause, final ExceptionContext context) {
        super(message, cause, context);
    }
    /**
     * コンストラクタ
     * @param message メッセージ
     * @param cause 例外オブジェクト
     */
    public AbstractRuntimeException(final String message, final Throwable cause) {
        super(message, cause);
    }
    /**
     * コンストラクタ
     * @param message メッセージ
     */
    public AbstractRuntimeException(final String message) {
        super(message);
    }
    /**
     * コンストラクタ
     * @param cause 例外オブジェクト
     */
    public AbstractRuntimeException(final Throwable cause) {
        super(cause);
    }
}
