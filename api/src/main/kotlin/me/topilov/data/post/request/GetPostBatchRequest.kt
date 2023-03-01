package me.topilov.data.post.request

import me.topilov.data.batch.BatchRequest
import me.topilov.utils.HttpMethod

data class GetPostBatchRequest(
    override val id: String,
    val postId: Int
) : BatchRequest(
    uri = "posts/$postId",
    method = HttpMethod.GET,
)