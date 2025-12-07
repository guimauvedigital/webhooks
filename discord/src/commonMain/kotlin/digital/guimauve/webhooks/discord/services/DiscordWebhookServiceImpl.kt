package digital.guimauve.webhooks.discord.services

import digital.guimauve.webhooks.discord.models.DiscordWebhook
import io.ktor.client.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.request.*
import io.ktor.http.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.json.Json

/**
 * Implementation of the DiscordWebhookService interface.
 */
class DiscordWebhookServiceImpl : DiscordWebhookService {

    private val json = Json {
        ignoreUnknownKeys = true
        explicitNulls = false
    }

    private val client = HttpClient {
        expectSuccess = true
        install(ContentNegotiation) {
            json(json)
        }
    }

    override suspend fun send(webhookUrl: String, discordWebhook: DiscordWebhook) {
        client.post(webhookUrl) {
            contentType(ContentType.Application.Json)
            setBody(discordWebhook)
        }
    }

}
