package id.phephen.cleanarchitecturewithusecase.di

import androidx.compose.ui.unit.Constraints
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import id.phephen.cleanarchitecturewithusecase.common.Constants
import id.phephen.cleanarchitecturewithusecase.data.remote.UsersApi
import id.phephen.cleanarchitecturewithusecase.data.remote.repository.UsersRepositoryImpl
import id.phephen.cleanarchitecturewithusecase.domain.repository.UserRepository
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

/**
 * Created by Phephen on 27/01/2022.
 */

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideUsersApi(): UsersApi {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(UsersApi::class.java)
    }

    @Provides
    @Singleton
    fun provideUsersRepository(api: UsersApi): UserRepository {
        return UsersRepositoryImpl(api)
    }

}