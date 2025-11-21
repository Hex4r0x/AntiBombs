package com.hex4r0x.github.antiBombs

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.BlockExplodeEvent
import org.bukkit.event.entity.EntityExplodeEvent

class ExplosionListener(private val plugin: AntiBombs) : Listener {

    @EventHandler
    fun onEntityExplode(event: EntityExplodeEvent) {
        if (plugin.config.getBoolean("prevent-explosions")) {
            event.blockList().clear()
        }
    }

    @EventHandler
    fun onBlockExplode(event: BlockExplodeEvent) {
        if (plugin.config.getBoolean("prevent-explosions")) {
            event.blockList().clear()
        }
    }
}
