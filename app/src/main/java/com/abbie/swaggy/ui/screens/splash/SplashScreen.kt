package com.abbie.swaggy.ui.screens.splash

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.abbie.swaggy.R
import com.abbie.swaggy.navigation.ROUT_HOME
import com.abbie.swaggy.navigation.ROUT_LOGIN
import com.abbie.swaggy.navigation.ROUT_SPLASH
import com.abbie.swaggy.ui.theme.newBlue
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun SplashScreen(navController: NavController){

   val coroutine = rememberCoroutineScope()
    coroutine.launch{
        delay(2000)
        navController.navigate(ROUT_LOGIN)
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .paint(painter = painterResource(R.drawable.img_5), contentScale = ContentScale.FillBounds),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){

        //Lottie Animation
        val composition by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(R.raw.cart))
        val progress by animateLottieCompositionAsState(composition)
        LottieAnimation(composition, progress,
            modifier = Modifier.size(300.dp)
        )


        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Shop smart. Live better",
            fontSize = 18.sp,
            color = newBlue,
            )
        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Thousand of products at your fingertips.Great deals. Fast delivery",
            fontSize = 15.sp,
            color = newBlue,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(10.dp))



    }




}
@Preview(showBackground = true)
@Composable
fun SplashScreenPreview(){
    SplashScreen(rememberNavController())


}