package digital.guimauve.webhooks.discord.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class DiscordEmbedFooter(
    val text: String,
    @SerialName("icon_url") val iconUrl: String? = null,
)
