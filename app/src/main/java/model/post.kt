package model

data class Post (
    val id: Int,
    val username: String,
    val profileImageUrl: String,
    val imageUrl: String,
    val likes: Int,
    val caption: String,
    val isLiked: Boolean = false
)
fun main() {
    val post = Post(id = 1, username = "yo", profileImageUrl = "", imageUrl = "", likes = 0, caption = "hola")
    println(post)

    val postLiked = post.copy(isLiked = true)
    println(postLiked)
}