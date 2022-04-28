package id.phephen.cleanarchitecturewithusecase.data.remote.dto

/**
 * Created by Phephen on 27/01/2022.
 */
data class Address(
    val city: String,
    val geo: Geo,
    val street: String,
    val suite: String,
    val zipcode: String
)
