package id.phephen.cleanarchitecturewithusecase.data.remote.repository

import id.phephen.cleanarchitecturewithusecase.data.remote.UsersApi
import id.phephen.cleanarchitecturewithusecase.data.remote.dto.UsersDTO
import id.phephen.cleanarchitecturewithusecase.domain.repository.UserRepository
import javax.inject.Inject

/**
 * Created by Phephen on 27/01/2022.
 */
class UsersRepositoryImpl @Inject constructor(
    private val api: UsersApi
) : UserRepository {

    override suspend fun getUsers(): List<UsersDTO> {
        return api.getUsers()
    }


}