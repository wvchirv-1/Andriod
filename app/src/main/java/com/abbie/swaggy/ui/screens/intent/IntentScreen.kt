package com.abbie.swaggy.ui.screens.intent

import android.content.Intent
import android.provider.MediaStore
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.abbie.swaggy.navigation.ROUT_DETAIL
import com.abbie.swaggy.navigation.ROUT_ITEM
import com.abbie.swaggy.ui.theme.newPurple
import com.abbie.swaggy.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun IntentScreen(navController: NavController){

    //Scaffold

    var selectedIndex by remember { mutableStateOf(0) }

    Scaffold(
        //TopBar
        topBar = {
            TopAppBar(
                title = { Text("Explore Intents") },
                navigationIcon = {
                    IconButton(onClick = {
                        navController.navigate(ROUT_DETAIL)
                    }) {
                        Icon(Icons.Default.ArrowBack, contentDescription = "Back")
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = newPurple,
                    titleContentColor = Color.White,
                    navigationIconContentColor = Color.White
                )
            )
        },

        //BottomBar
        bottomBar = {
            NavigationBar(
                containerColor = newPurple
            ){
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Home, contentDescription = "Home") },
                    label = { Text("Home") },
                    selected = selectedIndex == 0,
                    onClick = { selectedIndex = 0
                        //navController.navigate(ROUT_HOME)
                    }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Favorite, contentDescription = "Favorites") },
                    label = { Text("Favorites") },
                    selected = selectedIndex == 1,
                    onClick = { selectedIndex = 1
                        // navController.navigate(ROUT_HOME)
                    }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Person, contentDescription = "Profile") },
                    label = { Text("Profile") },
                    selected = selectedIndex == 2,
                    onClick = { selectedIndex = 2
                        //  navController.navigate(ROUT_HOME)
                    }
                )

            }
        },

        //FloatingActionButton
        floatingActionButton = {
            FloatingActionButton(
                onClick = { /* Add action */ },
                containerColor = newPurple
            ) {
                Icon(Icons.Default.Add, contentDescription = "Add")
            }
        },

        //Content
        content = { paddingValues ->
            val mContext = LocalContext.current



            Column(
                modifier = Modifier
                    .padding(paddingValues)
                    .fillMaxSize()
                    .paint(painter = painterResource(R.drawable.img_5), contentScale = ContentScale.FillBounds)
            ) {


                //Main Contents of the page
                  Text(
                      text = "Common Android Intents",
                      fontSize = 20.sp,
                      fontWeight = FontWeight.Bold,
                      modifier = Modifier.padding(start = 20.dp)
                  )

                Spacer(modifier = Modifier.height(10.dp))


                Text(
                    text = "Interact with system apps like messaging, calling, emails and more",
                    fontSize = 15.sp,
                    modifier = Modifier.padding(start = 20.dp)
                )

                Spacer(modifier = Modifier.height(10.dp))

                //STK
                OutlinedButton(
                    onClick = {
                        val simToolKitLaunchIntent =
                            mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                        simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                    },
                    modifier = Modifier.width(200.dp).align(alignment = Alignment.CenterHorizontally),
                    shape = RoundedCornerShape(10.dp)
                ) {
                    Text(text = "Pay with STK", color = Color.Black)
                }

                Spacer(modifier = Modifier.height(10.dp))

                //SMS
                OutlinedButton(
                    onClick = {
                        val smsIntent= Intent(Intent.ACTION_SENDTO)
                        smsIntent.data="smsto:0116399977".toUri()
                        smsIntent.putExtra("sms_body","Hello,how can i assist you?")
                        mContext.startActivity(smsIntent)
                    },
                    modifier = Modifier.width(200.dp).align(alignment = Alignment.CenterHorizontally),
                    shape = RoundedCornerShape(10.dp)
                ) {
                    Text(text = "Message Us", color = Color.Black)
                }

                Spacer(modifier = Modifier.height(10.dp))

                //CALL
                OutlinedButton(
                    onClick = {
                        val callIntent=Intent(Intent.ACTION_DIAL)
                        callIntent.data="tel:0116399977".toUri()
                        mContext.startActivity(callIntent)
                    },
                    modifier = Modifier.width(200.dp).align(alignment = Alignment.CenterHorizontally),
                    shape = RoundedCornerShape(10.dp)
                ) {
                    Text(text = "Contact Now", color = Color.Black)
                }

                Spacer(modifier = Modifier.height(10.dp))

                //EMAILS
                OutlinedButton(
                    onClick = {
                        val shareIntent = Intent(Intent.ACTION_SEND)
                        shareIntent.type = "text/plain"
                        shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("abbiewachira926@gmail.com"))
                        shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
                        shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is the email body")
                        mContext.startActivity(shareIntent)
                    },
                    modifier = Modifier.width(200.dp).align(alignment = Alignment.CenterHorizontally),
                    shape = RoundedCornerShape(10.dp)
                ) {
                    Text(text = "Send Email", color = Color.Black)
                }

                Spacer(modifier = Modifier.height(10.dp))

                //SHARE
                OutlinedButton(
                    onClick = {
                        val shareIntent=Intent(Intent.ACTION_SEND)
                        shareIntent.type="text/plain"
                        shareIntent.putExtra(Intent.EXTRA_TEXT, "Check out this is a cool content")
                        mContext.startActivity(Intent.createChooser(shareIntent, "Share"))
                    },
                    modifier = Modifier.width(200.dp).align(alignment = Alignment.CenterHorizontally),
                    shape = RoundedCornerShape(10.dp)
                ) {
                    Text(text = "Share", color = Color.Black)
                }

                Spacer(modifier = Modifier.height(10.dp))

                //CAMERA
                OutlinedButton(
                    onClick = {
                        val cameraIntent=Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                        if (cameraIntent.resolveActivity(mContext.packageManager)!=null){
                            mContext.startActivity(cameraIntent)
                        }else{
                            println("Camera app is not available")
                        }
                    },
                    modifier = Modifier.width(200.dp).align(alignment = Alignment.CenterHorizontally),
                    shape = RoundedCornerShape(10.dp)
                ) {
                    Text(text = "Open Camera", color = Color.Black)
                }

                Spacer(modifier = Modifier.height(10.dp))


                Text(
                    text = "Tip: Intents help your app perform actions outside its boundary.",
                    fontSize = 15.sp,
                    modifier = Modifier.padding(start = 20.dp)
                )





            }
        }
    )

    //End of scaffold
}
@Preview
@Composable
fun IntentScreenPreview(){
    IntentScreen(rememberNavController())


}