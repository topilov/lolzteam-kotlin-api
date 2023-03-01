package me.topilov.data.user.request

import me.topilov.data.batch.BatchRequest
import me.topilov.utils.HttpMethod

data class UnfollowUserBatchRequest(
    override val id: String,
    val userId: Int,
) : BatchRequest(
    uri = "users/${userId}/followers",
    method = HttpMethod.DELETE
)