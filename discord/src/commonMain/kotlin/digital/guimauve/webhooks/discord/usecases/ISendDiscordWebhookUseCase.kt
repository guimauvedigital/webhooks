package digital.guimauve.webhooks.discord.usecases

import dev.kaccelero.usecases.IPairSuspendUseCase
import digital.guimauve.webhooks.discord.dsl.DiscordWebhookBuilder
import digital.guimauve.webhooks.discord.dsl.discordWebhook
import digital.guimauve.webhooks.discord.models.DiscordWebhook

interface ISendDiscordWebhookUseCase : IPairSuspendUseCase<String, DiscordWebhook, Unit> {

    suspend operator fun invoke(input1: String, input2: DiscordWebhookBuilder.() -> Unit) =
        invoke(input1, discordWebhook(input2))

}
