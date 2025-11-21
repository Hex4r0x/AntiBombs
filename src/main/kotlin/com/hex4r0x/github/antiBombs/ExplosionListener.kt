package com.hex4r0x.github.antiBombs

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.BlockExplodeEvent
import org.bukkit.event.entity.EntityExplodeEvent

class ExplosionListener(private val plugin: AntiBombs) : Listener {

    @EventHandler
    fun onEntityExplode(event: EntityExplodeEvent) {
        val entityType = event.entityType.name
        if (plugin.config.getBoolean("explosions.entities.$entityType", false)) {
            event.blockList().clear()
        }
    }

    @EventHandler
    fun onBlockExplode(event: BlockExplodeEvent) {
        val blockType = event.block.type.name
        if (plugin.config.getBoolean("explosions.blocks.$blockType", false)) {
            event.blockList().clear()
        }
    }
}
