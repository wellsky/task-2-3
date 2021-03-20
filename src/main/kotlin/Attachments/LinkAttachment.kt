package Attachments

class LinkAttachment : Attachment {
    override val type: String = "link"
    val link: Link = Link()
}