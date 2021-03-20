package Attachments

class FileAttachment : Attachment {
    override val type: String = "file"
    val file: File = File()
}