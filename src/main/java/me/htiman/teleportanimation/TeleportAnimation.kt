package me.htiman.teleportanimation

import org.bukkit.plugin.java.JavaPlugin
import revxrsal.commands.bukkit.BukkitCommandHandler

class TeleportAnimation : JavaPlugin() {
    override fun onEnable() {
        instance = this
        val handler = BukkitCommandHandler.create(this)
        handler.register(Camera.CameraCommand)



    }

    companion object {
        lateinit var instance: TeleportAnimation
            private set
    }
}
