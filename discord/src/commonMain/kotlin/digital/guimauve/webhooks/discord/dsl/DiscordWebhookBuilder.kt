package digital.guimauve.webhooks.discord.dsl

import digital.guimauve.webhooks.discord.models.DiscordEmbed
import digital.guimauve.webhooks.discord.models.DiscordWebhook

class DiscordWebhookBuilder {

    var content: String? = null
    var username: String? = null
    var avatarUrl: String? = null
    private val embeds = mutableListOf<DiscordEmbed>()

    fun embed(block: DiscordEmbedBuilder.() -> Unit) {
        embeds += DiscordEmbedBuilder().apply(block).build()
    }

    fun build(): DiscordWebhook {
        return DiscordWebhook(
            content = content,
            username = username,
            avatarUrl = avatarUrl,
            embeds = if (embeds.isNotEmpty()) embeds else null
        )
    }

}
