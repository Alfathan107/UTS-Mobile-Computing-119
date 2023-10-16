package com.example.utsmobcom119_alfathanahnaf

import android.annotation.SuppressLint
import android.net.wifi.hotspot2.pps.HomeSp
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.utsmobcom119_alfathanahnaf.data.HomeContent
import com.example.utsmobcom119_alfathanahnaf.ui.theme.UTSMobcom119_AlfathanAhnafTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UTSMobcom119_AlfathanAhnafTheme {
                MataKuliah()
                }
            }
        }
    }


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MataKuliah(){
    Scaffold(
        content={
            HomeContent()
        }
    )

}
