package com.hex4r0x.github.antiBombs

import org.bukkit.plugin.java.JavaPlugin

class AntiBombs : JavaPlugin() {

    override fun onEnable() {
        // Plugin startup logic
        saveDefaultConfig()
        server.pluginManager.registerEvents(ExplosionListener(this), this)
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}
