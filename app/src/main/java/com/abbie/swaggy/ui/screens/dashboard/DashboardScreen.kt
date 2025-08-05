package com.abbie.swaggy.ui.screens.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
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
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.abbie.swaggy.ui.theme.newPurple
import com.abbie.swaggy.R
import com.abbie.swaggy.navigation.ROUT_HOME
import com.abbie.swaggy.navigation.ROUT_ITEM
import com.abbie.swaggy.ui.theme.newPurple


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashboardScreen(navController: NavController){
//Scaffold

    var selectedIndex by remember { mutableStateOf(0) }

    Scaffold(
        //TopBar
        topBar = {

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


            }
        },

        //FloatingActionButton
        floatingActionButton = {
            FloatingActionButton(
                onClick = { /* Add action */ },
                containerColor = Color.LightGray,
                modifier = Modifier.offset(y = 40.dp)
            ) {
                Icon(Icons.Default.Add, contentDescription = "Add")
            }
        },
        floatingActionButtonPosition = FabPosition.Center,
        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .padding(paddingValues)
                    .fillMaxSize()
            ) {


                //Main Contents of the page
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column() {
                        Text(text = "Hi Samantha", fontSize = 30.sp, fontWeight = FontWeight.Bold)
                        Spacer(modifier = Modifier.height(15.dp))
                        Text("Here are your projects", fontSize = 17.sp)
                        Spacer(modifier = Modifier.height(8.dp))
                    }

                    Image(
                        painter = painterResource(R.drawable.img_4),
                        contentDescription = "welcome",
                        modifier = Modifier.size(150.dp)
                    )

                }



                Spacer(modifier = Modifier.height(40.dp))

                //Row
                Row(
                    modifier = Modifier.padding(start = 20.dp).horizontalScroll(rememberScrollState())


                ) {
                    //Card
                    Card(
                        onClick = {navController.navigate(ROUT_HOME)},
                        modifier = Modifier.width(150.dp).height(250.dp),
                        elevation = CardDefaults.elevatedCardElevation(5.dp),
                        //colors = CardDefaults.cardColors(newPurple)
                    ) {
                        Box(
                            modifier = Modifier.fillMaxSize(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(R.drawable.img_7),
                                contentDescription = "blue",
                                modifier = Modifier.fillMaxWidth().height(300.dp),
                                contentScale = ContentScale.Crop
                            )

                            Text(text = "Cryptocurrency landing page", fontSize = 17.sp, fontWeight = FontWeight.Bold, color = Color.LightGray, modifier = Modifier.padding(start = 20.dp, top = 20.dp))
                            Spacer(modifier = Modifier.height(15.dp))

                            Text(text = "12 tasks", fontSize = 15.sp, fontWeight = FontWeight.Bold, color = Color.LightGray,  modifier = Modifier.padding(top = 250.dp, end = 45.dp))
                        }
                    }
                    //End of card


                    Spacer(modifier = Modifier.width(15.dp))

                    //Card
                    Card(
                        onClick = {},
                        modifier = Modifier.width(150.dp).height(250.dp),
                        elevation = CardDefaults.elevatedCardElevation(5.dp),
                        //colors = CardDefaults.cardColors(newPurple)
                    ) {
                        Box(
                            modifier = Modifier.fillMaxSize(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(R.drawable.img_8),
                                contentDescription = "Clothes",
                                modifier = Modifier.fillMaxWidth().height(250.dp),
                                contentScale = ContentScale.Crop
                            )

                            Text(text = "Statistics Dashboard", fontSize = 17.sp, fontWeight = FontWeight.Bold, color = Color.LightGray, modifier = Modifier.padding(start = 20.dp, top = 20.dp))
                            Spacer(modifier = Modifier.height(15.dp))

                            Text(text = "2 tasks", fontSize = 15.sp, fontWeight = FontWeight.Bold, color = Color.LightGray,  modifier = Modifier.padding(top = 250.dp, end = 45.dp))
                        }
                    }
                    //End of card


                    Spacer(modifier = Modifier.width(15.dp))

                    //Card
                    Card(
                        onClick = {},
                        modifier = Modifier.width(150.dp).height(250.dp),
                        elevation = CardDefaults.elevatedCardElevation(5.dp),
                        //colors = CardDefaults.cardColors(newPurple)
                    ) {
                        Box(
                            modifier = Modifier.fillMaxSize(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(R.drawable.img_9),
                                contentDescription = "green",
                                modifier = Modifier.fillMaxWidth().height(300.dp),
                                contentScale = ContentScale.Crop
                            )

                            Text(text = "Cryptocurrency landing page", fontSize = 17.sp, fontWeight = FontWeight.Bold, color = Color.LightGray, modifier = Modifier.padding(start = 20.dp, top = 20.dp))
                            Spacer(modifier = Modifier.height(15.dp))

                            Text(text = "12 tasks", fontSize = 15.sp, fontWeight = FontWeight.Bold, color = Color.LightGray,  modifier = Modifier.padding(top = 250.dp, end = 45.dp))
                        }
                    }
                    //End of card


                    Spacer(modifier = Modifier.height(30.dp))

                }
                //End of Row
                Spacer(modifier = Modifier.height(30.dp))



                //Card- personal tasks
                Card(
                    onClick = {},
                    modifier = Modifier.fillMaxSize(),
                    shape = RoundedCornerShape(16.dp),
                    elevation = CardDefaults.elevatedCardElevation(5.dp)
                ) {
                    Column(
                        modifier = Modifier.padding(16.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = "Personal Tasks",
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp

                        )

                        //1ST Card
                        Card(
                            onClick = {},
                            colors = CardDefaults.cardColors(containerColor = Color.White),
                            modifier = Modifier.height(100.dp).fillMaxWidth(),

                            ) {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                            ) {
                                Image(painter = painterResource(R.drawable.img_5),
                                    contentDescription = "Video",
                                    modifier = Modifier.size(40.dp))

                                Text(
                                    text = "NDA Review for Website project",
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 15.sp,
                                    modifier = Modifier.padding(20.dp),
                                )
                            }
                            Text(
                                text = "Today- 10pm",
                                modifier = Modifier.padding(start = 50.dp)
                            )

                        }
                        Spacer(modifier = Modifier.height(20.dp))
                        //End of 2ND Card
//1ST Card
                        Card(
                            onClick = {},
                            colors = CardDefaults.cardColors(containerColor = Color.White),
                            modifier = Modifier.height(100.dp).fillMaxWidth(),

                            ) {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                            ) {
                                Image(painter = painterResource(R.drawable.img_5),
                                    contentDescription = "Video",
                                    modifier = Modifier.size(40.dp))

                                Text(
                                    text = "NDA Review for Website project",
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 15.sp,
                                    modifier = Modifier.padding(20.dp),
                                )
                            }
                            Text(
                                text = "Today- 10pm",
                                modifier = Modifier.padding(start = 50.dp)
                            )

                        }
                        //End of 2ND Card



                    }

                }

                //end of card


            }
        }
    )

    //End of scaffold






}

@Preview
@Composable
fun DashboardScreenPreview(){

    DashboardScreen(rememberNavController())
}