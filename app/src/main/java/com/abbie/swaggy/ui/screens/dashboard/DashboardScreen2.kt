package com.abbie.swaggy.ui.screens.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.abbie.swaggy.R
import com.abbie.swaggy.ui.theme.newGreen
import com.abbie.swaggy.ui.theme.newPurple

@Composable
fun DashboardScreen2(navController: NavController){

    Column(
        modifier = Modifier.fillMaxSize().verticalScroll(rememberScrollState())
    ) {
        //Card
        Card(
            modifier = Modifier.fillMaxWidth().height(300.dp),
            shape = RoundedCornerShape(bottomStart = 40.dp),
            colors = CardDefaults.cardColors(newGreen)
        ) {
            Column(modifier = Modifier.padding(20.dp)) {
                IconButton(onClick = {}) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "",
                        tint = Color.White
                    )
                }

                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = "CryptoCurrency ",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )

                Text(
                    text = "Landing Page",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )

                Spacer(modifier = Modifier.height(10.dp))


                //Row

                Row(
                    horizontalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(R.drawable.img_4),
                        contentDescription = "welcome",
                        modifier = Modifier.size(50.dp),
                        contentScale = ContentScale.Crop
                    )
                    Spacer(modifier = Modifier.width(10.dp))


                    Text(
                        text = "Samantha",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )

                }
                //End of Row

                //Row

                Row() {
                    Text(text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis.",
                        modifier = Modifier.width(200.dp),
                        color = Color.White
                    )

                }
                //End of row
            }

            //End of column

        }

        //End of Card

        Image(
            painter = painterResource(R.drawable.img_13),
            contentDescription = "man",
            modifier = Modifier
                .size(180.dp)
                .align(alignment = Alignment.CenterHorizontally)
                .offset(x = 130.dp, y = -150.dp),
            contentScale = ContentScale.Crop



        )


        //Row
        Row(
            modifier = Modifier.padding(30.dp).horizontalScroll(rememberScrollState())
        ) {
            Column() {
                Image(painter = painterResource(R.drawable.img_10),
                    contentDescription = "",
                    contentScale =ContentScale.Crop,
                    modifier = Modifier.size(80.dp)
                )
                Text(text = "Layout Docs",
                    fontSize = 17.sp,
                    fontWeight = FontWeight.Bold
                )

                Text(
                    text = "PDF . 10MB",
                    fontSize = 15.sp,

                    )

            }

            Spacer(modifier = Modifier.width(30.dp))


            Column() {
                Image(painter = painterResource(R.drawable.img_11),
                    contentDescription = "",
                    contentScale =ContentScale.Crop,
                    modifier = Modifier.size(80.dp)
                )
                Text(text = "Presentation",
                    fontSize = 17.sp,
                    fontWeight = FontWeight.Bold
                )

                Text(
                    text = "MOV . 10MB",
                    fontSize = 15.sp,

                    )

            }


            Spacer(modifier = Modifier.width(30.dp))


            Column() {
                Image(painter = painterResource(R.drawable.img_12),
                    contentDescription = "",
                    contentScale =ContentScale.Crop,
                    modifier = Modifier.size(80.dp)
                )
                Text(text = "All Assets",
                    fontSize = 17.sp,
                    fontWeight = FontWeight.Bold
                )

                Text(
                    text = "ZIP . 10MB",
                    fontSize = 15.sp,

                    )

            }

        }

        //End of row

        //Row
        Row(
            modifier = Modifier.padding(30.dp).horizontalScroll(rememberScrollState())
        ) {
            Column() {
                Image(painter = painterResource(R.drawable.img_10),
                    contentDescription = "",
                    contentScale =ContentScale.Crop,
                    modifier = Modifier.size(80.dp)
                )
                Text(text = "Layout Docs",
                    fontSize = 17.sp,
                    fontWeight = FontWeight.Bold
                )

                Text(
                    text = "PDF . 10MB",
                    fontSize = 15.sp,

                    )

            }

            Spacer(modifier = Modifier.width(30.dp))


            Column() {
                Image(painter = painterResource(R.drawable.img_11),
                    contentDescription = "",
                    contentScale =ContentScale.Crop,
                    modifier = Modifier.size(80.dp)
                )
                Text(text = "Presentation",
                    fontSize = 17.sp,
                    fontWeight = FontWeight.Bold
                )

                Text(
                    text = "MOV . 10MB",
                    fontSize = 15.sp,

                    )

            }


            Spacer(modifier = Modifier.width(30.dp))


            Column() {
                Image(painter = painterResource(R.drawable.img_12),
                    contentDescription = "",
                    contentScale =ContentScale.Crop,
                    modifier = Modifier.size(80.dp)
                )
                Text(text = "All Assets",
                    fontSize = 17.sp,
                    fontWeight = FontWeight.Bold
                )

                Text(
                    text = "ZIP . 10MB",
                    fontSize = 15.sp,

                    )

            }

        }

        //End of row





    }




}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DashboardScreen2Preview(){

    DashboardScreen2(rememberNavController())
}