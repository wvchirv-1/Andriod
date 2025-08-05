package com.abbie.swaggy.ui.screens.form

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.abbie.swaggy.R
import com.abbie.swaggy.navigation.ROUT_ITEM
import com.abbie.swaggy.ui.theme.newBlue
import com.abbie.swaggy.ui.theme.newPurple
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition


@Composable
fun FormScreen(navController: NavController){

    var username by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var confirmpassword by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(newPurple),
        
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

       //Card

        Card(
            modifier = Modifier.fillMaxWidth().height(800.dp),
            shape = RoundedCornerShape(topStart = 60.dp, topEnd = 60.dp)
        ) {
           Column(
               horizontalAlignment = Alignment.CenterHorizontally
           ){
               Spacer(modifier = Modifier.height(10.dp))

               Text(
                   text = "Swaggy",
                   fontSize = 40.sp,
                   color = newBlue,
                   fontFamily = FontFamily.Cursive,
                   fontWeight = FontWeight.Bold,
               )
               Spacer(modifier = Modifier.height(8.dp))

               Text(
                   text = "Join us and start your journey today",
                   fontSize = 15.sp
               )
               Spacer(modifier = Modifier.height(8.dp))

               //username
               OutlinedTextField(
                   value = username,
                   onValueChange = { username = it },
                   modifier = Modifier.fillMaxWidth().padding(start = 10.dp, end = 10.dp),
                   leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "username") },
                   label = {Text(text = "username")},
                   colors = OutlinedTextFieldDefaults.colors(
                       unfocusedBorderColor = newPurple,
                       focusedBorderColor = Color.Black,
                       unfocusedLeadingIconColor = newPurple
                   ),
                   keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)

               )

               //End of email

               Spacer(modifier = Modifier.height(8.dp))

               //username
               OutlinedTextField(
                   value = email,
                   onValueChange = { email = it },
                   modifier = Modifier.fillMaxWidth().padding(start = 10.dp, end = 10.dp),
                   leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "username") },
                   label = {Text(text = "email address")},
                   colors = OutlinedTextFieldDefaults.colors(
                       unfocusedBorderColor = newPurple,
                       focusedBorderColor = Color.Black,
                       unfocusedLeadingIconColor = newPurple
                   ),
                   keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)

               )

               //End of email

               Spacer(modifier = Modifier.height(8.dp))

               //password
               OutlinedTextField(
                   value = password,
                   onValueChange = { password = it },
                   modifier = Modifier.fillMaxWidth().padding(start = 10.dp, end = 10.dp),
                   leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "username") },
                   label = {Text(text = "password")},
                   colors = OutlinedTextFieldDefaults.colors(
                       unfocusedBorderColor = newPurple,
                       focusedBorderColor = Color.Black,
                       unfocusedLeadingIconColor = newPurple
                   ),
                   keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                   visualTransformation = PasswordVisualTransformation()

               )

               //End of password

               Spacer(modifier = Modifier.height(8.dp))

               //confirm password
               OutlinedTextField(
                   value = confirmpassword,
                   onValueChange = { confirmpassword = it },
                   modifier = Modifier.fillMaxWidth().padding(start = 10.dp, end = 10.dp),
                   leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "username") },
                   label = {Text(text = "confirm password")},
                   colors = OutlinedTextFieldDefaults.colors(
                       unfocusedBorderColor = newPurple,
                       focusedBorderColor = Color.Black,
                       unfocusedLeadingIconColor = newPurple
                   ),
                   keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)

               )

               //End of confirm password

               Spacer(modifier = Modifier.height(8.dp))
               Button(
                   onClick = {

                   },
                   colors = ButtonDefaults.buttonColors(newPurple),
                   shape = RoundedCornerShape(10.dp),
                   modifier = Modifier.fillMaxWidth().padding(start = 10.dp, end = 10.dp)

               ) {
                   Text(text = "Create an account")
               }
               Spacer(modifier = Modifier.height(8.dp))

               TextButton(onClick = {}) {
                   Text(text = "Already have an account?Login")
               }

           }

            //End of card

        }
           }
        }

    //End of main layout




@Preview(showBackground = true)
@Composable
fun FormScreenPreview(){
    FormScreen(rememberNavController())


}