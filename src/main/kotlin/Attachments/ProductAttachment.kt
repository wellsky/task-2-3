package Attachments

class ProductAttachment(product: Product) : Attachment {
    override fun show() {
        println("Show product icon {$this.product.name}")
    }

    override fun play() {
        println("Show product content {$this.product.name}")
    }
}