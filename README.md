# GTA-Style Teleport Animation (Utility)

This is a simple **utility** you can copy into your Paper/Spigot plugin to add a cinematic, GTA-style teleport effect for players.
It’s not a standalone plugin or full API just a class you can reuse.

---

## ✨ What It Does

* Smoothly moves the player’s camera in **3 stages**:

  1. Rises up to a high point.
  2. Slides horizontally to the destination.
  3. Descends to the target Y level.
* Uses **ease-in-out quadratic** motion for smoothness.
* Teleports the player to the destination at the end.
* Temporarily switches them into **Spectator mode**, then restores their gamemode.

---

## 📦 How To Use

1. Copy `Camera.kt` (and supporting enums/utilities) into your plugin’s source.
2. Call the `MoveCameraTask` directly when you want to animate a teleport:

```kotlin
// Example usage
val destination = Location(Bukkit.getWorld("world2"), -734.0, 113.0, 1449.0, 0f, 90f)

player.gameMode = GameMode.SPECTATOR
Camera.CameraCommand.MoveCameraTask(
    player,
    destination,
    player,
    TeleportAnimation.instance
).runTaskTimer(TeleportAnimation.instance, 0, 1)
```

3. The task will run automatically and complete the cinematic teleport.

---

## 📋 Requirements

* Paper/Spigot **1.20+**
* Java 17+
* Kotlin (if your plugin is written in Kotlin)

---

## 🔧 Notes

* Designed as a **drop-in util** — no config, no commands needed.
* You can tweak values inside `MoveCameraTask`:

  * `highPoint` → how high the camera rises
  * `duration` → speed of each stage
  * `epsilon` → threshold for ending a stage

---

## 🚀 Possible Extensions

* Add fade-to-black transitions.
* Support `Player#setCamera` instead of Spectator mode (Paper 1.20.5+).
* Configurable easing functions for different cinematic feels.

