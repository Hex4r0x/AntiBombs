<div align="center">
  <img src="src/main/resources/icon.png" width="128" height="128">
  <h1>AntiBombs Minecraft Plugin</h1>
</div>

## Overview

**AntiBombs** is a lightweight Minecraft server plugin built for Paper 1.21.10 that prevents all terrain damage caused by explosions. It works by listening to the `EntityExplodeEvent` (and related explosion events) and cancelling them, ensuring that blocks are never destroyed by TNT, creepers, ghasts, or any other source of explosions.

## Features

- **Zero terrain damage**: Prevent block damage from explosions.
- **Fine-grained control**: Configure protection per entity type (Creeper, TNT, etc.) and block type (Respawn Anchor, Bed).
- **Compatibility**: Works with Paper API `1.21.10‑R0.1`.
- **Simple configuration**: Easy-to-read `config.yml` to toggle specific explosion sources.
- **Lightweight**: Minimal performance impact.

## Installation

1. Download the compiled `AntiBombs.jar` from the releases page (or build it yourself – see the _Building_ section).
2. Place the JAR file into your server's `plugins/` directory.
3. Restart or reload the server.
4. The plugin will automatically generate the default configuration.

## Building from Source

The project uses Gradle with Kotlin DSL.

```bash
# Clone the repository
git clone https://github.com/yourusername/AntiBombs.git
cd AntiBombs

# Build the plugin
./gradlew build
```

The compiled JAR will be located at `build/libs/AntiBombs-<version>.jar`.

## Usage

The plugin creates a `config.yml` file in `plugins/AntiBombs/`. You can configure which explosions are prevented by editing this file.

**Default Configuration:**

```yaml
# AntiBombs Configuration

# Fine-grained control for explosions.
# Set to 'true' to PREVENT the explosion (protect terrain).
# Set to 'false' to ALLOW the explosion.

explosions:
  entities:
    CREEPER: true
    TNT: true
    TNT_MINECART: true
    FIREBALL: true
    WITHER: true
    WITHER_SKULL: true
    DRAGON_FIREBALL: true
    PRIMED_TNT: true
  blocks:
    RESPAWN_ANCHOR: true
    BED: true
```

After changing the configuration, restart the server or reload the plugin for changes to take effect.

## License

This project is licensed under the MIT License – see the `LICENSE` file for details.

## Contributing

Contributions are welcome! Feel free to open issues or submit pull requests for bug fixes, performance improvements, or additional features (e.g., whitelist certain explosions).
