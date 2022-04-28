package id.phephen.cleanarchitecturewithusecase.domain.use_case.get_users

import id.phephen.cleanarchitecturewithusecase.common.Resource
import id.phephen.cleanarchitecturewithusecase.data.remote.dto.toUser
import id.phephen.cleanarchitecturewithusecase.domain.model.User
import id.phephen.cleanarchitecturewithusecase.domain.repository.UserRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

/**
 * Created by Phephen on 27/01/2022.
 */
class GetUsersUseCase @Inject constructor(
    private val repository: UserRepository
) {
    operator fun invoke(): Flow<Resource<List<User>>> = flow {
        try {
            emit(Resource.Loading<List<User>>())
            val users = repository.getUsers().map { it.toUser() }
            emit(Resource.Success<List<User>>(users))
        } catch (e: HttpException) {
            emit(Resource.Error<List<User>>(e.localizedMessage ?: "An unexpected error occurred"))
        } catch (e: IOException) {
            emit(Resource.Error<List<User>>("Couldn't reach server. Check your internet connection."))
        }
    }
}