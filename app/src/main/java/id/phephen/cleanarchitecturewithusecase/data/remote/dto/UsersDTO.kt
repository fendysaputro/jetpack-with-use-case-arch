package id.phephen.cleanarchitecturewithusecase.data.remote.dto

import id.phephen.cleanarchitecturewithusecase.domain.model.User

/**
 * Created by Phephen on 27/01/2022.
 */
data class UsersDTO(
    val address: Address,
    val company: Company,
    val email: String,
    val id: Int,
    val name: String,
    val phone: String,
    val username: String,
    val website: String
)

fun UsersDTO.toUser(): User {
    return User(
        id = id,
        name = name,
        username = username,
        email = email
    )
}
