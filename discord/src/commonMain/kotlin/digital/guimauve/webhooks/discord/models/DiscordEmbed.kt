package digital.guimauve.webhooks.discord.models

import kotlinx.serialization.Serializable

@Serializable
data class DiscordEmbed(
    val title: String? = null,
    val description: String? = null,
    val url: String? = null,
    val color: Int? = null,
    val fields: List<DiscordEmbedField>? = null,
    val footer: DiscordEmbedFooter? = null,
    val image: DiscordEmbedImage? = null,
    val thumbnail: DiscordEmbedThumbnail? = null,
)
