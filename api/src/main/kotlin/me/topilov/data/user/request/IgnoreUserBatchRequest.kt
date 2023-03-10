package me.topilov.data.user.request

import me.topilov.data.batch.BatchRequest
import me.topilov.utils.HttpMethod

data class IgnoreUserBatchRequest(
    val userId: Int,
) : BatchRequest(
    uri = "users/$userId/ignore",
    method = HttpMethod.POST,
)