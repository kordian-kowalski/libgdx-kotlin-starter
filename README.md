# A minimalistic LibGDX Kotlin starter

Minimalistic Gradle starter configuration for a LibGDX project using Kotlin and KTX.

## Development
**IntelliJ IDEA / Android Studio**:
1. open the directory as a project
1. accept the prompt to import a Gradle project
1. if IDEA / Android Studio complains about Project JDK not being defined, just select your installed JDK from the dropdown instead of *project default*.

Alternatively you can choose to import a Gradle project directly which will achieve the same thing.

Your Kotlin code should live in the `src/main/kotlin` directory.

## Running the project
Run `gradlew run` in terminal in the project directory.

## Resources
Place your resources in `src/main/resources`.
They can be accessed with `Gdx.files.internal(<path>)`

The default LibGDX UI skin is already included in the `skin` directory.

## Dependencies
All dependencies are in the `build.gradle` file. Some suggested dependencies are listed but commented out - if you
want to include them (recommended), just uncomment them.

You can also add your own dependencies following the same pattern.  

## Disclaimer
Yes, there are a lot of unconfigured options: Java, tests, IDEA / eclipse plugins, probably more.

This is only meant to be a barebones starter script for getting a LibGDX project going under Kotlin.

This also demonstrates how little configuration is needed to get a project like this to build and run with Gradle.
