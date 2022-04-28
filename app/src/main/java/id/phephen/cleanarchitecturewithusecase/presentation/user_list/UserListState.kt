package id.phephen.cleanarchitecturewithusecase.presentation.user_list

import id.phephen.cleanarchitecturewithusecase.domain.model.User

/**
 * Created by Phephen on 27/01/2022.
 */

data class UserListState(
    val isLoading: Boolean = false,
    val users: List<User> = emptyList(),
    val error: String = ""
)