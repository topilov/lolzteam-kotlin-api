package me.topilov.data.user.request

import mapOfNotNull
import me.topilov.data.batch.BatchRequest
import me.topilov.utils.HttpMethod

data class GetIgnoredUsersBatchRequest(
    override val id: String,
    val total: Int? = null
) : BatchRequest(
    uri = "users/ignored",
    method = HttpMethod.GET,
    params = mapOfNotNull(
        "total" to total,
    )
)