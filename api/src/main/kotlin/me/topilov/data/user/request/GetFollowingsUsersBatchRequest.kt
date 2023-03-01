package me.topilov.data.user.request

import mapOfNotNull
import me.topilov.data.batch.BatchRequest
import me.topilov.utils.HttpMethod

data class GetFollowingsUsersBatchRequest(
    override val id: String,
    val userId: Int,
    val order: String? = null,
    val page: Int? = null,
    val limit: Int? = null,
) : BatchRequest(
    uri = "users/${userId}/followings",
    method = HttpMethod.GET,
    params = mapOfNotNull(
        "order" to order,
        "page" to page,
        "limit" to limit,
    )
)