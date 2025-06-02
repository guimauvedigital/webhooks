package digital.guimauve.webhooks.discord.dsl

import digital.guimauve.webhooks.discord.models.*

class DiscordEmbedBuilder {

    var title: String? = null
    var description: String? = null
    var url: String? = null
    var color: Int? = null
    private val fields = mutableListOf<DiscordEmbedField>()
    var footer: DiscordEmbedFooter? = null
    var image: DiscordEmbedImage? = null
    var thumbnail: DiscordEmbedThumbnail? = null

    fun field(name: String, value: String, inline: Boolean = false) {
        fields += DiscordEmbedField(name, value, inline)
    }

    fun footer(text: String, iconUrl: String? = null) {
        footer = DiscordEmbedFooter(text, iconUrl)
    }

    fun image(url: String) {
        image = DiscordEmbedImage(url)
    }

    fun thumbnail(url: String) {
        thumbnail = DiscordEmbedThumbnail(url)
    }

    fun build(): DiscordEmbed = DiscordEmbed(
        title = title,
        description = description,
        url = url,
        color = color,
        fields = if (fields.isNotEmpty()) fields else null,
        footer = footer,
        image = image,
        thumbnail = thumbnail
    )

}
