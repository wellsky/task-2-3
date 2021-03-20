package Attachments

class LinkAttachment(link: Link) : Attachment {
    override fun show() {
        println("Show link preview {$this.link.name}")
    }

    override fun play() {
        println("Open link {$this.link.name}")
    }
}