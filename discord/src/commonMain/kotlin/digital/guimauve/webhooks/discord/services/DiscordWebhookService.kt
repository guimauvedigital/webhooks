package digital.guimauve.webhooks.discord.services

import digital.guimauve.webhooks.discord.dsl.DiscordWebhookBuilder
import digital.guimauve.webhooks.discord.dsl.discordWebhook
import digital.guimauve.webhooks.discord.models.DiscordWebhook

interface DiscordWebhookService {

    /**
     * Sends a Discord webhook to the specified URL.
     *
     * @param webhookUrl The webhook URL.
     * @param discordWebhook The DiscordWebhook payload.
     */
    suspend fun send(webhookUrl: String, discordWebhook: DiscordWebhook)

    /**
     * Sends a Discord webhook to the specified URL using a builder function.
     *
     * @param webhookUrl The webhook URL.
     * @param block A builder function to create the DiscordWebhook payload.
     */
    suspend fun send(webhookUrl: String, block: DiscordWebhookBuilder.() -> Unit) =
        send(webhookUrl, discordWebhook(block))

}
