package Attachments

class AudioAttachment(audio: Audio) : Attachment {
    override fun show() {
        println("Show audio icon {$this.audio.name}")
    }

    override fun play() {
        println("Play audio {$this.audio.name}")
    }
}