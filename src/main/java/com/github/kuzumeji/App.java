// ========================================================================
// Copyright (C) Kuzumeji Software Team. All rights reserved.
// GNU AFFERO GENERAL PUBLIC LICENSE Version 3, 19 November 2007
// http://www.gnu.org/licenses/agpl-3.0.txt
// ========================================================================
package com.github.kuzumeji;
/**
 * アプリケーション
 */
public final class App {
    /**
     * メイン関数
     * @param args 引数
     */
    public static void main(final String[] args) {
        System.out.println(new App().getGreeting());
    }
    /**
     * 挨拶
     * @return 挨拶テキスト
     */
    @SuppressWarnings("static-method")
    public String getGreeting() {
        return "Hello world.";
    }
}
