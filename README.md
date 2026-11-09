# 30 Days Fitness

A scrollable 30-day workout plan: one card per day with the day's exercise, an illustration and a description you can expand.

Built while following Google's [Android Basics with Compose](https://developer.android.com/courses/android-basics-compose/course) course (the "30 Days" app project).

## Features

- Scrollable list of 30 daily activities (warm-ups, bodyweight basics, core, cardio, HIIT, recovery and more)
- Tap a card to expand or collapse the full description, with a spring animation
- Center-aligned top app bar, edge-to-edge layout

## Built with

- Kotlin, Jetpack Compose, Material 3
- `LazyColumn`, `Card`, `animateContentSize`, `remember`/`mutableStateOf`
- Data held in a static `ActivitiesRepository` backed by string and drawable resources
- Min SDK 24, target/compile SDK 35

## Run it

1. Open the project folder in Android Studio and let Gradle sync.
2. Run the `app` configuration on an emulator or device (Android 7.0 / API 24 or newer).

Or, with a device or emulator connected:

```sh
./gradlew installDebug
```
