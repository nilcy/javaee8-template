# JavaEE8-Template

## 開発環境の構築

* Gradleをインストールします。
* JavaアプリケーションのGradleプロジェクトを作成します。
`$ gradle init --type java-application`
* ビルド設定(build.gradle)へ `apply plugin: 'eclipse'` を追加します。
* Eclipseプロジェクトを作成します。
`$ gradle eclipse`
* Eclipseから該当プロジェクトをインポートします。
* 【該当プロジェクト】→【右クリック】→【Configure】→【Convert to Gradle(STS) Project】 を実行します。
* Gradleをリフレッシュします。(Ctrl+F5)

## 開発コンセプト

* Google Guava を全面採用。基本ライブラリ、コレクション拡張、ユーティリティなど仲良くなること。
* Commons Lang を採用。考え方を真似る。(nullセーフ、Javadocの書き方、内部キャッシュなど)
* ロギングは SLF4J+Logback を採用。
* テストは JUnit5 を採用。
* JavaEE8 ベースAPI を採用。
* 本来のオブジェクト指向(メッセージ指向)を推進する。(return thisのメッセージチェーンなど)
