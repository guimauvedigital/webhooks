package digital.guimauve.webhooks.discord.usecases

import dev.kaccelero.serializers.Serialization
import digital.guimauve.webhooks.discord.models.DiscordWebhook
import io.ktor.client.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.request.*
import io.ktor.http.*
import io.ktor.serialization.kotlinx.json.*

class SendDiscordWebhookUseCase : ISendDiscordWebhookUseCase {

    val client = HttpClient {
        install(ContentNegotiation) {
            json(Serialization.json)
        }
    }

    override suspend fun invoke(input1: String, input2: DiscordWebhook) {
        client.post(input1) {
            contentType(ContentType.Application.Json)
            setBody(input2)
        }
    }

}
