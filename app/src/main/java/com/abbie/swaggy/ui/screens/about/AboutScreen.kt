package com.abbie.swaggy.ui.screens.about

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.abbie.swaggy.ui.theme.newPurple
import com.abbie.swaggy.R
import com.abbie.swaggy.ui.theme.newBlue





@Composable
fun AboutScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {


        Icon(
            imageVector = Icons.Filled.ShoppingCart,
            contentDescription = "cart",
            modifier = Modifier.size(180.dp).clip(CircleShape)
        )
        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "About",
            fontSize = 60.sp,
            color = newBlue,
            fontFamily = FontFamily.Cursive,
            fontWeight = FontWeight.Bold,
        )
        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Dress shabbily and they remember the dress; dress impeccably and they remember the woman",
            fontSize = 18.sp,
            textAlign = TextAlign.Center,
            color = newBlue
        )

        Spacer(modifier = Modifier.height(100.dp))



        Row(

        ) {
            Box(modifier = Modifier.size(15.dp).background(color = Color.Blue, shape = CircleShape))

            Spacer(modifier = Modifier.height(10.dp))

            Box(modifier = Modifier.size(15.dp).background(color = Color.Black, shape = CircleShape))

            Spacer(modifier = Modifier.height(15.dp))


            Box(modifier = Modifier.size(15.dp).background(color = Color.Black, shape = CircleShape))

            Spacer(modifier = Modifier.height(10.dp))

            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(newBlue),
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier.padding(end = 10.dp, start = 250.dp)

            ) {
                Text(text = "Skip")
            }

        }


    }


}
@Preview(showBackground = true)
@Composable
fun AboutScreenPreview() {
    AboutScreen()
}









