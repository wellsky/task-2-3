package Attachments

class AudioAttachment : Attachment {
    override val type: String = "audio"
    val audio: Audio = Audio()
}