package ir.thatsmejavad.userly

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform