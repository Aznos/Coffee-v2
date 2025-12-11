package com.maddoxh

import net.fabricmc.api.ModInitializer
import org.slf4j.Logger
import org.slf4j.LoggerFactory

object Coffee : ModInitializer {
    const val MOD_ID = "coffee"
    val logger: Logger = LoggerFactory.getLogger("coffee")

	override fun onInitialize() {
		logger.info("Hello Fabric world!")
	}
}