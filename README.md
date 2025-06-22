# webhooks

Simple messaging webhooks for easy alerting & monitoring in your applications.

## Discord

```kotlin
dependencies {
    implementation("digital.guimauve.webhooks:discord:1.0.2")
}
```

```kotlin
val sendDiscordWebhookUseCase = SendDiscordWebhookUseCase()
sendDiscordWebhookUseCase("<your webhook url>") {
    username = "Kotlin Bot"
    avatarUrl = "..."
    content = "Hello from Kotlin!"
    embed {
        title = "Ktor & Discord"
        description = "This embed was created with a DSL"
        color = 0x00FF00
        field("Field 1", "Some value", inline = true)
        footer("Made with ❤️")
    }
}
```

## More platforms coming soon!
