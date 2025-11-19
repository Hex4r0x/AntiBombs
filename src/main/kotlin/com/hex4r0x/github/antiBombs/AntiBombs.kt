package com.hex4r0x.github.antiBombs

import org.bukkit.plugin.java.JavaPlugin

class AntiBombs : JavaPlugin() {

    override fun onEnable() {
        // Plugin startup logic
        server.pluginManager.registerEvents(ExplosionListener(), this)
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}
