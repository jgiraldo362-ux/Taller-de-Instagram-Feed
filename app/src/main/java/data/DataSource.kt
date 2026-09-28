package data

import model.Post
import model.Story

object DataSource {

    fun getPosts(): List<Post> = listOf(
        Post(1, "android_developer", "https://picsum.photos/seed/user1/200/200", "https://picsum.photos/seed/post1/800/800", 1284, "Explorando Jetpack Compose 🚀 #Android #Kotlin"),
        Post(2, "kotlin_ninja", "https://picsum.photos/seed/user2/200/200", "https://picsum.photos/seed/post2/800/800", 847, "Data classes son la mejor feature de Kotlin 💜", true),
        Post(3, "compose_ui", "https://picsum.photos/seed/user3/200/200", "https://picsum.photos/seed/post3/800/800", 3456, "Material3 + Compose = perfecta combinación 🎨"),
        Post(4, "google_devs", "https://picsum.photos/seed/user4/200/200", "https://picsum.photos/seed/post4/800/800", 12891, "Android 15 trae increíbles mejoras de performance! 📱"),
        Post(5, "mobile_craft", "https://picsum.photos/seed/user5/200/200", "https://picsum.photos/seed/post5/800/800", 629, "LazyColumn vs RecyclerView: ¿cuál prefieres? 🤔"),
        Post(6, "ux_android", "https://picsum.photos/seed/user6/200/200", "https://picsum.photos/seed/post6/800/800", 2103, "Animaciones fluidas con animate*AsState 💫", true),
        Post(7, "dev_colombia", "https://picsum.photos/seed/user7/200/200", "https://picsum.photos/seed/post7/800/800", 445, "Coil hace super fácil cargar imágenes en Compose 🖼️"),
        Post(8, "juan_dev", "https://picsum.photos/seed/user8/200/200", "https://picsum.photos/seed/post8/800/800", 320, "Aprendiendo Compose paso a paso 💪"),
        Post(9, "bucaramanga_code", "https://picsum.photos/seed/user9/200/200", "https://picsum.photos/seed/post9/800/800", 578, "Programando desde la ciudad bonita 🌆"),
        Post(10, "secure_apps", "https://picsum.photos/seed/user10/200/200", "https://picsum.photos/seed/post10/800/800", 912, "Seguridad primero en cada app 🔐")
    )

    fun getStories(): List<Story> = listOf(
        Story(1, "Tu historia", "https://picsum.photos/seed/s1/200/200", false),
        Story(2, "android_dev", "https://picsum.photos/seed/s2/200/200", false),
        Story(3, "kotlin_fan", "https://picsum.photos/seed/s3/200/200", false),
        Story(4, "google_io", "https://picsum.photos/seed/s4/200/200", true),
        Story(5, "juan_dev", "https://picsum.photos/seed/s5/200/200", false),
        Story(6, "compose_ui", "https://picsum.photos/seed/s6/200/200", true),
        Story(7, "dev_colombia", "https://picsum.photos/seed/s7/200/200", false)
    )
}