package ui.components

import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import coil3.request.ImageRequest
import coil3.request.crossfade
import model.Post

@Composable
fun CoilBasico() {
    AsyncImage(
        model = "https://picsum.photos/seed/post1/800/800",
        contentDescription = "Foto de post",
        modifier = Modifier
            .fillMaxWidth()
            .aspectRatio(1f),
        contentScale = ContentScale.Crop
    )
}

@Composable
fun CoilAvanzado(post: Post) {
    AsyncImage(
        model = ImageRequest.Builder(LocalContext.current)
            .data(post.imageUrl)
            .crossfade(true)
            .build(),
        contentDescription = "Post de ${post.username}",
        modifier = Modifier
            .fillMaxWidth()
            .aspectRatio(1f),
        contentScale = ContentScale.Crop,
        placeholder = ColorPainter(Color.LightGray),
        error = ColorPainter(Color.Red)
    )
}

@Composable
fun CoilAvatar(post: Post) {
    AsyncImage(
        model = post.profileImageUrl,
        contentDescription = "Avatar",
        modifier = Modifier
            .size(36.dp)
            .clip(CircleShape),
        contentScale = ContentScale.Crop
    )
}