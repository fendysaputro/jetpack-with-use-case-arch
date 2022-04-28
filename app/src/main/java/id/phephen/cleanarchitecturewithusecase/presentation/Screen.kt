package id.phephen.cleanarchitecturewithusecase.presentation

/**
 * Created by Phephen on 27/01/2022.
 */
sealed class Screen(val route: String) {
    object UserListScreen: Screen("user_list_screen")
}