package dev.decu.demo

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform