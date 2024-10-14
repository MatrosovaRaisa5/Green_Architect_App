package com.yt.greenarchitectapp.screens.activities

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.yt.greenarchitectapp.BaseActivity
import com.yt.greenarchitectapp.commonui.DrawerContent
import com.yt.greenarchitectapp.model.drawerContent
import com.yt.greenarchitectapp.screens.bottomNavigation.BottomBar
import com.yt.greenarchitectapp.screens.bottomNavigation.HomeNavigation
import com.yt.greenarchitectapp.ui.theme.lightGray
import com.yt.greenarchitectapp.ui.theme.orange

class HomeActivity : BaseActivity() {

    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    @Composable
    override fun Content() {
        val scaffoldState: ScaffoldState = rememberScaffoldState()
        val navHostController = rememberNavController()
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .background(lightGray)
        ) {
            Scaffold(
                bottomBar = {
                    BottomBar(navController = navHostController)
                },
                drawerContent = {
                    Spacer(modifier = Modifier.height(20.dp))
                    drawerContent.forEach {
                        DrawerContent(drawer = it, isline = it.name != "Правила")
                    }
                },
                scaffoldState = scaffoldState,
                drawerBackgroundColor = orange
                ) {
                HomeNavigation(navHostController = navHostController,scaffoldState)
            }
        }
    }


}