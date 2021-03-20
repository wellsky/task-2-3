package Attachments

class ProductAttachment : Attachment {
    override val type: String = "product"
    val product: Product = Product()
}