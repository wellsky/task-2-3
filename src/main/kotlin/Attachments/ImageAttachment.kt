package Attachments

class ImageAttachment : Attachment {
    override val type: String = "image"
    val image: Image = Image()
}