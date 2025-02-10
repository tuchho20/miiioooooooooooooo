package dev.chungjungsoo.gptmobile.data.dto.anthropic.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("content_block_start")
data class ContentStartResponseChunk(

    @SerialName("index")
    val index: Int,

    @SerialName("content_block")
    val contentBlock: ContentBlock
) : MessageResponseChunk()
