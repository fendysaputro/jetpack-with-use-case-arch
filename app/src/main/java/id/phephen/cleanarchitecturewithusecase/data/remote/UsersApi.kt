package id.phephen.cleanarchitecturewithusecase.data.remote

import id.phephen.cleanarchitecturewithusecase.data.remote.dto.UsersDTO
import retrofit2.http.GET

/**
 * Created by Phephen on 27/01/2022.
 */
interface UsersApi {
    @GET
    suspend fun getUsers(): List<UsersDTO>
}