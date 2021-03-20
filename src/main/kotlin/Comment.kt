import Attachments.Attachment

data class Comment(
    val id: Int = 0, // идентификатор комментария.
    val postId: Int, // идентификатор поста
    val fromId: Int, // идентификатор автора комментария.
    val date: Int, // дата создания комментария в формате Unixtime.
    val text: String, // текст комментария.
    val replyToUser: Int? = null, // идентификатор пользователя или сообщества, в ответ которому оставлен текущий комментарий (если применимо).
    val replyToComment: Int? = null, // идентификатор комментария, в ответ на который оставлен текущий (если применимо).
    val attachments: Array<Attachment> = emptyArray()//медиавложения комментария (фотографии, ссылки и т.п.). Описание массива attachments находится на отдельной странице.
)