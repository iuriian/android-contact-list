package com.iuriian.androidcontactlist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.rememberNavController
import com.iuriian.androidcontactlist.controller.router.AppRouterGraph
import com.iuriian.androidcontactlist.ui.theme.AndroidContactListTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidContactListTheme {
                val navController = rememberNavController()

                AppRouterGraph(navController)
            }
        }
    }
}
