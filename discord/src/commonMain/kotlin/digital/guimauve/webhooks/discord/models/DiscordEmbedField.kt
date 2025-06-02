package digital.guimauve.webhooks.discord.models

import kotlinx.serialization.Serializable

@Serializable
data class DiscordEmbedField(
    val name: String,
    val value: String,
    val inline: Boolean = false,
)
