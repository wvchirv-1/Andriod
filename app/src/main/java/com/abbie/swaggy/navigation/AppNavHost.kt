package com.abbie.swaggy.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.abbie.swaggy.data.UserDatabase
import com.abbie.swaggy.repository.UserRepository
import com.abbie.swaggy.ui.screens.about.AboutScreen
import com.abbie.swaggy.ui.screens.auth.LoginScreen
import com.abbie.swaggy.ui.screens.auth.RegisterScreen
import com.abbie.swaggy.ui.screens.category.CategoryScreen
import com.abbie.swaggy.ui.screens.contact.ContactScreen
import com.abbie.swaggy.ui.screens.dashboard.DashboardScreen
import com.abbie.swaggy.ui.screens.detail.DetailScreen
import com.abbie.swaggy.ui.screens.form.FormScreen
import com.abbie.swaggy.ui.screens.home.HomeScreen
import com.abbie.swaggy.ui.screens.intent.IntentScreen
import com.abbie.swaggy.ui.screens.item.ItemScreen
import com.abbie.swaggy.ui.screens.scaffold.ScaffoldScreen
import com.abbie.swaggy.ui.screens.splash.SplashScreen
import com.abbie.swaggy.viewmodel.AuthViewModel

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUT_SPLASH
) {
    val context = LocalContext.current
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier,
    ) {
        composable(ROUT_HOME) {
            HomeScreen(navController)
        }
        composable(ROUT_ABOUT) {
            AboutScreen(navController)
        }
        composable(ROUT_CONTACT) {
            ContactScreen(navController)
        }

        composable(ROUT_ITEM) {
            ItemScreen(navController)
        }
        composable(ROUT_CATEGORY) {
            CategoryScreen(navController)
        }
        composable(ROUT_SPLASH) {
            SplashScreen(navController)
        }
        composable(ROUT_SCAFFOLD) {
            ScaffoldScreen(navController)
        }
        composable(ROUT_DETAIL) {
            DetailScreen(navController)
        }
        composable(ROUT_INTENT) {
            IntentScreen(navController)
        }
        composable(ROUT_DASHBOARD) {
            DashboardScreen(navController)
        }
        composable(ROUT_DASHBOARD2) {
            DashboardScreen(navController)
        }

        composable(ROUT_FORM) {
           FormScreen(navController)
        }

        //AUTHENTICATION

        // Initialize Room Database and Repository for Authentication
        val appDatabase = UserDatabase.getDatabase(context)
        val authRepository = UserRepository(appDatabase.userDao())
        val authViewModel: AuthViewModel = AuthViewModel(authRepository)
        composable(ROUT_REGISTER) {
            RegisterScreen(authViewModel, navController) {
                navController.navigate(ROUT_LOGIN) {
                    popUpTo(ROUT_REGISTER) { inclusive = true }
                }
            }
        }

        composable(ROUT_LOGIN) {
            LoginScreen(authViewModel, navController) {
                navController.navigate(ROUT_HOME) {
                    popUpTo(ROUT_LOGIN) { inclusive = true }
                }
            }
        }








    }
}