package dev.chungjungsoo.gptmobile.util

import java.io.File

object FileUtils {

    fun listFiles(directoryPath: String): List<String> {
        val directory = File(directoryPath)
        return directory.listFiles()?.map { it.name } ?: emptyList()
    }

    fun createFile(directoryPath: String, fileName: String, content: String): Boolean {
        return try {
            val file = File(directoryPath, fileName)
            file.writeText(content)
            true
        } catch (e: Exception) {
            false
        }
    }

    fun modifyFile(directoryPath: String, fileName: String, content: String): Boolean {
        return try {
            val file = File(directoryPath, fileName)
            if (file.exists()) {
                file.writeText(content)
                true
            } else {
                false
            }
        } catch (e: Exception) {
            false
        }
    }
}Last
