object WallService {
    private var posts: Array<Post> = emptyArray<Post>()
    private var nextId = 1

    fun reset() {
        posts = emptyArray<Post>()
        nextId = 1
    }

    fun add(post: Post): Post {
        post.id = nextId++
        this.posts += post
        return posts.last()
    }

    fun update(editedPost: Post): Boolean {
        for ((index, post) in posts.withIndex()) {
            if (post.id == editedPost.id) {
                // Редактируем
                posts[index] = post.copy(
                    ownerId = editedPost.ownerId,
                    createdBy = editedPost.createdBy,
                    text = editedPost.text,
                    replyOwnerId = editedPost.replyOwnerId,
                    replyPostId = editedPost.replyPostId,
                    friendsOnly = editedPost.friendsOnly,
                    comments = editedPost.comments,
                    copyright = editedPost.copyright,
                    likes = editedPost.likes,
                    reposts = editedPost.reposts,
                    views = editedPost.views,
                    postType = editedPost.postType,
                    signerId = editedPost.signerId,
                    canPin = editedPost.canPin,
                    canDelete = editedPost.canDelete,
                    canEdit = editedPost.canEdit,
                    isPinned = editedPost.isPinned,
                    markedAsAds = editedPost.markedAsAds,
                    isFavorite = editedPost.isFavorite,
                    donut = editedPost.donut,
                    postponedId = editedPost.postponedId
                )
                return true;
            }
        }
        return false;
    }
}