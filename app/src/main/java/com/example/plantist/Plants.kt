package com.example.plantist

data class Plants(
    var name: String ="",
    var detail: String ="",
    var description: String ="",
    var water: String ="",
    var illumination: String ="",
    var temperature: String ="",
    var fertilizer: String ="",
    var shareMessage: String = "",
    var photoFlag: String = "",
    var photo: Int = 0
)
