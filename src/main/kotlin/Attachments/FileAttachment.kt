package Attachments

class FileAttachment(file: File) : Attachment {
    override fun show() {
        println("Show file icon {$this.file.name}")
    }

    override fun play() {
        println("Play file {$this.file.name}")
    }
}