package com.abbie.swaggy.ui.screens.item

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.abbie.swaggy.ui.theme.newPurple
import com.abbie.swaggy.R
import com.abbie.swaggy.ui.theme.newBlue

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ItemScreen(){
    Column(
        modifier = Modifier.fillMaxSize()
    ){
        TopAppBar(
            title = { Text(text = "Products") },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = newPurple,
                titleContentColor = Color.White,
                navigationIconContentColor = Color.White,
                actionIconContentColor = Color.White

            ),
            navigationIcon = {
                IconButton(onClick = {}) {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = "Menu",

                    )
                }
            },

            actions = {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.ShoppingCart,
                        contentDescription = "ShoppingCart",)
                }

                IconButton(onClick = {}) {
                    Icon(
                        imageVector = Icons.Default.Notifications,
                        contentDescription = "Notifications"

                        )
                }
            }


        )
        //End of TopAppBar

        Image(
            painter = painterResource(R.drawable.dress),
            contentDescription = "dress",
            modifier = Modifier.fillMaxWidth().height(250.dp),
            contentScale = ContentScale.FillWidth
        )

        Spacer(modifier = Modifier.height(10.dp))

        //search Bar
        var search by remember { mutableStateOf("") }
        OutlinedTextField(
            value = search,
            onValueChange = { search =it},
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = "search") },
            placeholder = { Text(text = "Search product...") },
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = newPurple,
                focusedBorderColor = Color.Gray
            )

        )

        //End of Search Bar
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "Other Products",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center

        )

        Spacer(modifier = Modifier.height(10.dp))

        //row

        Row(
            modifier = Modifier.padding(start = 20.dp)
        ){
            Image(
                painter = painterResource(R.drawable.dress),
                contentDescription = "dress",
                modifier = Modifier.size(width = 200.dp, height = 250.dp).clip(shape = RoundedCornerShape(10.dp)),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.width(10.dp))

            Column(){
                Text(text = "Stylish Cotton Shirt", fontSize = 18.sp, fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.height(5.dp))
                Text(text = "Brand :Alexander Fashion", fontSize = 15.sp)
                Spacer(modifier = Modifier.height(5.dp))
                Text(text = "Price : Ksh.2000", fontSize = 15.sp, textDecoration = TextDecoration.LineThrough)
                Spacer(modifier = Modifier.height(5.dp))
                Text(text = "Now : Ksh.1800", fontSize = 15.sp)
                Spacer(modifier = Modifier.height(5.dp))
                Text(text = "Material : 100% Cotton", fontSize = 15.sp)

                Row(){
                    Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = newPurple)
                    Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = newPurple)
                    Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = newPurple)
                    Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = newPurple)
                    Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Black)
                }

                Button(onClick = {},
                    colors = ButtonDefaults.buttonColors(newPurple),
                    shape = RoundedCornerShape(10.dp),
                    ) {
                    Text(text = "Buy now")

                }



            }



        }



        //End of row



    }


}
@Preview(showBackground = true)
@Composable
fun ItemScreenPreview(){
    ItemScreen()


}