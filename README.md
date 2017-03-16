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

