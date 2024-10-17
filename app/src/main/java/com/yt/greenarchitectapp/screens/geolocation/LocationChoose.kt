package com.yt.greenarchitectapp.screens.geolocation

import android.Manifest
import android.content.Context
import android.location.Geocoder
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.google.accompanist.permissions.ExperimentalPermissionsApi
import com.google.accompanist.permissions.rememberMultiplePermissionsState
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import java.util.Locale
import com.yt.greenarchitectapp.R

@OptIn(ExperimentalPermissionsApi::class)
@Composable
fun LocationChoose(
    navController: NavHostController
) {
    val gradient = Brush.linearGradient(
        colors = listOf(Color(0xFFF8EF42), Color(0xFF0FD64F)),
        start = Offset(0f, 0f),
        end = Offset(1000f, 2000f)
    )

    Box(modifier =  Modifier
        .fillMaxSize()
        .background(gradient)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top,
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 40.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.icon),
                contentDescription = null,
                modifier = Modifier
                    .padding(bottom = 320.dp)
                    .width(200.dp)
                    .height(200.dp),
            )
            Text(
                "Пожалуйста, выберите ваш город или регион",
                textAlign = TextAlign.Center,
                fontSize = 20.sp,
                fontWeight = FontWeight(500),
                color = Color.White,
                modifier = Modifier.padding(top = 20.dp, bottom = 20.dp)
            )
        }

        val context = LocalContext.current
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(bottom = 32.dp),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(
                onClick = { navController.navigate("citiesList") },
                modifier = Modifier.fillMaxWidth(0.7f),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF64ff94)
                )
            ) {
                Text(
                    text = "Выбрать",
                    fontSize = 16.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                )
            }
            Spacer(modifier = Modifier.height(16.dp))

            val permissions = listOf(
                Manifest.permission.ACCESS_FINE_LOCATION,
                Manifest.permission.ACCESS_COARSE_LOCATION
            )

            val permissionState = rememberMultiplePermissionsState(permissions)
            var hasNavigated by remember { mutableStateOf(false) }

            if (permissionState.allPermissionsGranted) {
                LaunchedEffect(Unit) {
                    if (!hasNavigated)
                    {
                        getLocation(context, navController)
                        hasNavigated = true
                    }
                }
            }
            Button(
                onClick = { permissionState.launchMultiplePermissionRequest() },
                modifier = Modifier.fillMaxWidth(0.7f),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFFFFFFF)
                )
            ) {
                Text(
                    text = "Определить автоматически",
                    fontSize = 16.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                )
            }
        }
    }
}

fun getLocation(context: Context, navController: NavHostController)
{
    val fusedLocationClient: FusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(context)

    fusedLocationClient.lastLocation.addOnSuccessListener { location ->
        if (location != null) {
            val cityName = getCityName(location.latitude, location.longitude, context)
            navController.navigate("locationConfirm/${cityName}")
        } else {
            navController.navigate("locationConfirm/null")
        }
    }
}

private fun getCityName(latitude: Double, longitude: Double, context: Context): String? {
    val geocoder = Geocoder(context, Locale("ru"))
    val addresses = geocoder.getFromLocation(latitude, longitude, 1)
    return if (addresses != null) {
        addresses[0]?.locality
    } else {
        null
    }
}