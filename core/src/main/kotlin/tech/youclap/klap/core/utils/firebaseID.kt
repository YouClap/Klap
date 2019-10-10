package tech.youclap.klap.core.utils

import kotlin.random.Random

private const val AUTO_ID_LENGTH = 20

private const val AUTO_ID_ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"

/**
 * Copied and adapted from here
 * https://github.com/firebase/firebase-android-sdk/blob/9421586ff52e752e95916341fa64203207ada547/firebase-firestore/src/main/java/com/google/firebase/firestore/util/Util.java#L45
 */
fun generateFirebaseID(): String {

    val builder = StringBuilder()
    val maxRandom = AUTO_ID_ALPHABET.length

    for (i in 0 until AUTO_ID_LENGTH) {
        builder.append(AUTO_ID_ALPHABET[Random.nextInt(maxRandom)])
    }

    return builder.toString()
}
