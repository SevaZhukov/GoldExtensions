# Gold Extensions

This library will help you to use common things as Toast, Snackbar, Log, AlertDialog in your project easier

### Add Gold Extensions to your project

Add it in your root build.gradle at the end of repositories:

```Code
allprojects {
  repositories {
    ...
    maven { url 'https://jitpack.io' }
  }
}
```

Add the dependency

```Code
dependencies {
  implementation 'com.github.MrSwimmer:GoldExtensions:1.0'
}
```

### Use it

```Kotlin
log("Hello")
snack("Fucking")
toast("Extensions")
alertInfo("Enjoy!")
```

Enjoy!
