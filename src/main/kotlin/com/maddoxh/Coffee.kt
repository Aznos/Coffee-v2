package com.maddoxh

import net.fabricmc.api.ModInitializer
import org.slf4j.LoggerFactory

object Coffee : ModInitializer {
    private val logger = LoggerFactory.getLogger("coffee")

	override fun onInitialize() {
		logger.info("Hello Fabric world!")
	}
}