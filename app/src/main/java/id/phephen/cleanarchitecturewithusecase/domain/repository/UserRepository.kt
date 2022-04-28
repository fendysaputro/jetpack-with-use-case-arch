package id.phephen.cleanarchitecturewithusecase.domain.repository

import id.phephen.cleanarchitecturewithusecase.data.remote.dto.UsersDTO

/**
 * Created by Phephen on 27/01/2022.
 */
interface UserRepository {

    suspend fun getUsers(): List<UsersDTO>

}