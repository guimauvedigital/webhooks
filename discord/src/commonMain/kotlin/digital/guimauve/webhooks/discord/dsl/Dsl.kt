package digital.guimauve.webhooks.discord.dsl

import digital.guimauve.webhooks.discord.models.DiscordWebhook

fun discordWebhook(block: DiscordWebhookBuilder.() -> Unit): DiscordWebhook {
    return DiscordWebhookBuilder().apply(block).build()
}
