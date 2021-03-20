package Attachments

class ImageAttachment(image: Image) : Attachment {
    override fun show() {
        println("Show image icon {$this.image.name}")
    }

    override fun play() {
        println("Show full image {$this.image.name}")
    }
}